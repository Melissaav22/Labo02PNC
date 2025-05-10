package org.example.carstore.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Venta", schema = "public")
public class Venta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_venta")
    private Long idVenta;

    @ManyToOne
    @JoinColumn(name = "Id_modelo", nullable = false)
    private Modelo modelo;

    @ManyToOne
    @JoinColumn(name = "Id_local", nullable = false)
    private Local local;

    @ManyToOne
    @JoinColumn(name = "Id_empleado", nullable = false)
    private Empleado empleado;

    @Column(name = "Precio_venta", nullable = false, precision = 10, scale = 2)
    private BigDecimal precioVenta;

    public Venta(Modelo modelo, Local local, Empleado empleado, BigDecimal precioVenta) {
        this.modelo = modelo;
        this.local = local;
        this.empleado = empleado;
        this.precioVenta = precioVenta;
    }

    // Getters and Setters
    public Long getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(Long idVenta) {
        this.idVenta = idVenta;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }
}
