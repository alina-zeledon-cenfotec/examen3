package com.cenfotec.examen3.examen3.Entities;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Column;
import javax. persistence. Entity;
import javax. persistence. GeneratedValue;
import javax. persistence.GenerationType;
import javax. persistence. Id;

    @Data
    @EqualsAndHashCode
    @Entity
    public class User implements Serializable {

        private static final long serialVersionUID = 1L;
        @Id
        @Column(name = "ID", nullable = false)
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;

        @Column(name = "nombre", nullable = false)
        private String nombre;

        @Column(name = "plan")
        private String plan;

        @Column(name = "alergias")
        private String alergias;

        @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
        @JoinColumn(name = "responsableId", referencedColumnName = "ID")
        private Responsable responsableId;


        public  long getSerialVersionUID() {
            return serialVersionUID;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getPlan() {
            return plan;
        }

        public void setPlan(String plan) {
            this.plan = plan;
        }

        public String getAlergias() {
            return alergias;
        }

        public void setAlergias(String alergias) {
            this.alergias = alergias;
        }

        public Responsable getResponsableId() {
            return responsableId;
        }

        public void setResponsableId(Responsable responsableId) {
            this.responsableId = responsableId;
        }
    }

