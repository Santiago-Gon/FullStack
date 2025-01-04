package com.credibanco.prueba_full.repository;

import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.model.TransaciconProductos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITransaccionesProductosRepository extends JpaRepository<TransaciconProductos, Integer> {




}
