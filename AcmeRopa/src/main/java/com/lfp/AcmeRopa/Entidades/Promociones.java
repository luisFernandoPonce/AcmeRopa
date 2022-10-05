package com.lfp.AcmeRopa.Entidades;

import javax.persistence.*;


    @Entity
    @Table(name = "promociones")
    public class Promociones {

        //Atributos Promociones
        @Id
        @Column(unique = true, nullable = false)
        private String promoId;
        @Column(unique = false, nullable = false)
        private Double descuentoPromocion;

        //Constructores
        public Promociones() {
        }

        public Promociones(String promoId, Double descuentoPromocion) {
            this.promoId = promoId;
            this.descuentoPromocion = descuentoPromocion;
        }

        // Getters y Setters
        public String getPromoId() {
            return promoId;
        }

        public void setPromoId(String promoId) {
            this.promoId = promoId;
        }

        public Double getDescuentoPromocion() {
            return descuentoPromocion;
        }

        public void setDescuentoPromocion(Double descuentoPromocion) {
            this.descuentoPromocion = descuentoPromocion;
        }

        // To String
        @Override
        public String toString() {
            return "Promociones{" + "nombrePromocion=" + promoId + ", descuentoPromocion=" + descuentoPromocion + '}';
        }

    }
