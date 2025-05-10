package org.example.carstore.model.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "Telefono_tienda", schema = "public")
public class TelefonoTienda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id_telefono")
    private Long idTelefono;

    @ManyToOne
    @JoinColumn(name = "Id_local", nullable = false)
    private Local local;

    @Column(name = "Telefono", nullable = false, length = 20)
    private String telefono;

    public TelefonoTienda(Local local, Long idTelefono, String telefono) {
        this.local = local;
        this.idTelefono = idTelefono;
        this.telefono = telefono;
    }

    public Long getIdTelefono() {
        return idTelefono;
    }

    public void setIdTelefono(Long idTelefono) {
        this.idTelefono = idTelefono;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
}
