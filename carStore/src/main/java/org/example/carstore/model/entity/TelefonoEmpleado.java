package org.example.carstore.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Telefono_empleado", schema = "public")
public class TelefonoEmpleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_telefono")
    private Long idTelefono;

    @ManyToOne
    @JoinColumn(name = "Id_empleado", nullable = false)
    private Empleado empleado;

    @Column(name = "Telefono", nullable = false, length = 20)
    private String telefono;

    public TelefonoEmpleado(Empleado empleado, String telefono) {
        this.empleado = empleado;
        this.telefono = telefono;
    }

    // Getters and Setters
    public Long getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Long idTelefono) {
        this.idTelefono = idTelefono;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
