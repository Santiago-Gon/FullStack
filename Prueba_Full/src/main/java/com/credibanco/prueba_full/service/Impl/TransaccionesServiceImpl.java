package com.credibanco.prueba_full.service.Impl;

import com.credibanco.prueba_full.dto.ProductoDto;
import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.dto.TransaccionDto;
import com.credibanco.prueba_full.mapper.TarjetaMapper;
import com.credibanco.prueba_full.mapper.TransaccionMapper;
import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.model.Transaccion;
import com.credibanco.prueba_full.model.TransaciconProductos;
import com.credibanco.prueba_full.repository.ITarjetaRepository;
import com.credibanco.prueba_full.repository.ITransaccionRepository;
import com.credibanco.prueba_full.repository.ITransaccionesProductosRepository;
import com.credibanco.prueba_full.service.IProductosService;
import com.credibanco.prueba_full.service.ITransaccionesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TransaccionesServiceImpl implements ITransaccionesService {
    @Autowired
    private ITransaccionRepository transaccionesRepository;
    @Autowired
    private TransaccionMapper transaccionMapper;
    @Autowired
    private IProductosService productosService;
    @Autowired
    private ITransaccionesProductosRepository transaccionesProductosRepository;
    @Autowired
    private ITarjetaRepository tarjetaRepository;

    @Override
    public TransaccionDto crearTransaccion(TransaccionDto transaccion) {

        List<ProductoDto> productos = transaccion.getProductos().stream()
                .map(p-> productosService.buscarProductosId(p.getId()))
                .toList();
        Integer saldo = productos.stream().mapToInt(p->
            p.getPrice()
        ).sum();
        transaccion.setSaldo(saldo);
        transaccion.setFecha(new Date());
        Transaccion transaccionGuardar = transaccionMapper.transaccionDtoToTransaccion(transaccion);
        Transaccion transaccionGuardada = transaccionesRepository.save(transaccionGuardar);
        productos.forEach(p->{
            TransaciconProductos transaccionProductos = new TransaciconProductos(null,transaccionGuardada.getIdTransaccion(),p.getId(),p.getPrice(),p.getTitle());
            transaccionesProductosRepository.save(transaccionProductos);
        });
        Tarjeta tarjeta = tarjetaRepository.findById(transaccionGuardar.getIdTarjeta()).get();
        tarjeta.setSaldo(tarjeta.getSaldo()-saldo);
        tarjetaRepository.save(tarjeta);
        return transaccionMapper.transaccionToTransaccionDto(transaccionGuardada);
    }

    @Override
    public TransaccionDto consultarTransaccionId(Integer id) {
        return transaccionMapper.transaccionToTransaccionDto(transaccionesRepository.findById(id).get());
    }

    @Override
    public List<TransaccionDto> consultarTransaccion(Integer id) {
        return transaccionMapper.listTransaccionToListTransaccionDto(transaccionesRepository.findByIdUsuario(id));

    }

    @Override
    public TransaccionDto anularTransaccionId(Integer id) {
        Transaccion transaccion = transaccionesRepository.findById(id).get();
        Date fechaActual = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaActual);
        calendar.add(Calendar.DATE, -1);
        if (transaccion.getEstado().equals("Aprobada") && transaccion.getFecha().after(calendar.getTime())) {

            transaccion.setEstado("ANULADA");
            transaccion = transaccionesRepository.save(transaccion);
            Tarjeta tarjeta = tarjetaRepository.findById(transaccion.getIdTarjeta()).get();
            tarjeta.setSaldo(tarjeta.getSaldo()+transaccion.getSaldo());
            tarjetaRepository.save(tarjeta);
        }
        return transaccionMapper.transaccionToTransaccionDto(transaccion);
    }

}
