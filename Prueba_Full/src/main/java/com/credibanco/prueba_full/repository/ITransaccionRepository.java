package com.credibanco.prueba_full.repository;

import com.credibanco.prueba_full.model.Tarjeta;
import com.credibanco.prueba_full.model.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITransaccionRepository extends JpaRepository<Transaccion, Integer> {

    List<Transaccion> findByIdUsuario(Integer id);

}
