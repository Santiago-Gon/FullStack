package com.credibanco.prueba_full.service.Impl;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.mapper.TarjetaMapper;
import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.repository.ITarjetaRepository;
import com.credibanco.prueba_full.service.ITarjetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TarjetaServiceImpl implements ITarjetaService {
    @Autowired
    private ITarjetaRepository tarjetaRepository;
    @Autowired
    private TarjetaMapper tarjetaMapper;

    @Override
    public TarjetaDto consultarTarjetasId(Integer id) {
        return tarjetaMapper.tarjetaToTarjetaDto(tarjetaRepository.findById(id).get());
    }

    @Override
    public List<TarjetaDto> consultarTarjetas(Integer id) {
        return tarjetaMapper.listTarjetaToListTarjetaDto(tarjetaRepository.findByIdUsuario(id));

    }

    @Override
    public TarjetaDto crearTarjetas(TarjetaDto tarjeta) {
        Tarjeta tarjetaGuardar = tarjetaMapper.tarjetaDtoToTarjeta(tarjeta);
        return tarjetaMapper.tarjetaToTarjetaDto(tarjetaRepository.save(tarjetaGuardar));
    }

}
