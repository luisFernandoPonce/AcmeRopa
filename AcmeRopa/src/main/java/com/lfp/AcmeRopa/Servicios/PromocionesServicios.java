package com.lfp.AcmeRopa.Servicios;

import com.lfp.AcmeRopa.Entidades.Promociones;
import com.lfp.AcmeRopa.Repositorios.PromocionesRepositorios;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

    @Service
    public class PromocionesServicios {
        @Autowired
        PromocionesRepositorios promocionesRepositorios;

        // Metodo para recuperar todas las prendas
        public ArrayList<Promociones> obtenerPromociones() {
            return (ArrayList<Promociones>) promocionesRepositorios.findAll();
        }

        // Metodo para buscar por id
        // Optional para evitar que cause error si no existe
        public Optional<Promociones> obtenerPorId(String promoId) {
            return promocionesRepositorios.findById(promoId);
        }

        // Metodo para guardar prendas
        public void guardarPromocion(Promociones promocion) {
            promocionesRepositorios.save(promocion);
        }

        // Metodo para eliminar pod id
        public boolean eliminarPromocion(String promoId) {
            try {
                promocionesRepositorios.deleteById(promoId);
                return true;
            } catch(Exception exception) {
                return false;
            }
        }

    }

