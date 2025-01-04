package com.credibanco.prueba_full.mapper;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.dto.TransaccionDto;
import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.model.Transaccion;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper
public interface TransaccionMapper {

    public TransaccionDto transaccionToTransaccionDto(Transaccion transaccion);
    public Transaccion transaccionDtoToTransaccion(TransaccionDto transaccion);
    public List<TransaccionDto> listTransaccionToListTransaccionDto(List<Transaccion> listatransaccion);
    public List<Transaccion> listTransaccionDtoToListTransaccion(List<TransaccionDto> listatransaccion);

}
