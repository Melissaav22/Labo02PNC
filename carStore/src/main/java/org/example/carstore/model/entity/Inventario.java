package org.example.carstore.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Inventario", schema = "public")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_inventario")
    private Long idInventario;

    @ManyToOne
    @JoinColumn(name = "Id_local", nullable = false)
    private Local local;

    @ManyToOne
    @JoinColumn(name = "Id_modelo", nullable = false)
    private Modelo modelo;

    @Column(name = "cantidad", nullable = false)
    private Integer cantidad;

    public Inventario(Local local, Modelo modelo, Integer cantidad) {
        this.local = local;
        this.modelo = modelo;
        this.cantidad = cantidad;
    }

    // Getters and Setters
    public Long getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(Long idInventario) {
        this.idInventario = idInventario;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
