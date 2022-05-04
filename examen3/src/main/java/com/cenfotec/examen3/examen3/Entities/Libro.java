package com.cenfotec.examen3.examen3.Entities;


import java.io. Serializable;
import java.time. LocalDate;
import javax.persistence.Column;
import javax. persistence. Entity;
import javax. persistence. GeneratedValue;
import javax. persistence.GenerationType;
import javax. persistence. Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Entity
public class Libro implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "cedula", nullable = false)
    private String cedula;

    @Column(name = "direccion")
    private String direccion;

    @Column(name = "telefonoPrimario")
    private String telefonoPrimario;

    @Column(name = "telefonoSecundario")
    private String telefonoSecundario;

}
