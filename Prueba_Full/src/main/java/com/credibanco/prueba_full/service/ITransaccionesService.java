package com.credibanco.prueba_full.service;

import com.credibanco.prueba_full.dto.TarjetaDto;
import com.credibanco.prueba_full.dto.TransaccionDto;

import java.util.List;

public interface ITransaccionesService {


    TransaccionDto crearTransaccion(TransaccionDto transaccion);
    TransaccionDto consultarTransaccionId(Integer id);
    List<TransaccionDto> consultarTransaccion(Integer id);

    TransaccionDto anularTransaccionId(Integer id);
}
