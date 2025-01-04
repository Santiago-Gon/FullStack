package com.credibanco.prueba_full.service;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.model.Tarjeta;
import java.util.List;

public interface ITarjetaService {

    TarjetaDto consultarTarjetasId(Integer id);
    List<TarjetaDto> consultarTarjetas(Integer id);
    TarjetaDto crearTarjetas(TarjetaDto tarjeta);

}
