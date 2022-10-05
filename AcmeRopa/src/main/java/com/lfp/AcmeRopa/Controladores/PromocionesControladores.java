package com.lfp.AcmeRopa.Controladores;

import com.lfp.AcmeRopa.Entidades.Promociones;
import com.lfp.AcmeRopa.Servicios.PromocionesServicios;
import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    @RequestMapping("/promociones")
    public class PromocionesControladores {
        @Autowired
        PromocionesServicios promocionesServices;

        // Obtener Promociones y promociones por Id
        @GetMapping( path = "/api/v1/promociones/{promoId}")
        public ArrayList<Promociones> obtenerPromociones(@PathVariable("promoId") String promoId) {
            return this.promocionesServices.obtenerPromociones();
        }

        // Guardar prenda
        @PostMapping( path = "/api/v1/promociones")
        public void guardarPromocion(@RequestBody Promociones promocion) {
            this.promocionesServices.guardarPromocion(promocion);
        }

        @DeleteMapping( path = "/api/v1/promociones/{promoId}")
        public String eliminarPorId(@PathVariable("promoId") String promoId) {
            boolean eliminada = this.promocionesServices.eliminarPromocion(promoId);
            if (eliminada) {
                return "La promocion con este id ha sido eliminada: " + promoId;
            } else {
                return "La promocion con este id no fue eliminada: " + promoId;
            }

        }

    }
