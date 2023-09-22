package com.usta.proyecto2.Entity;

import jakarta.persistence.*;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Entity
@Data
@Table(name = "personas")
public class PersonaEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersona")
    private Long idpersona;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre")
    private String nombre;

    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellido")
    private String apellido;

    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "correo")
    private String correo;

}
