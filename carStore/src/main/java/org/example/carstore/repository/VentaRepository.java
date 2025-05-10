package org.example.carstore.repository;

import org.example.carstore.model.entity.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VentaRepository extends JpaRepository<Venta, Long> {


    List<Venta> findByModeloId(Long idModelo);
}
