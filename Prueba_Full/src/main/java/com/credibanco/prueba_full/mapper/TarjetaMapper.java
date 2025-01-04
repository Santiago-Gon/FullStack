package com.credibanco.prueba_full.mapper;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.model.Tarjeta;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface TarjetaMapper {

    public TarjetaDto tarjetaToTarjetaDto(Tarjeta tarjeta);
    public Tarjeta tarjetaDtoToTarjeta(TarjetaDto tarjeta);
    public List<TarjetaDto> listTarjetaToListTarjetaDto(List<Tarjeta> listatarjeta);
    public List<Tarjeta> listTarjetaDtoToListTarjeta(List<TarjetaDto> listatarjeta);
}
