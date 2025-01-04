package com.credibanco.prueba_full.repository;

import com.credibanco.prueba_full.model.Tarjeta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ITarjetaRepository extends JpaRepository<Tarjeta, Integer> {


    List<Tarjeta> findByIdUsuario(Integer id);
}
