package org.example.carstore.repository;

import org.example.carstore.model.entity.Inventario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InventarioRepository extends JpaRepository<Inventario, Long> {


    List<Inventario> findByLocalId(Long localId);

}
