package com.lfp.AcmeRopa.Repositorios;

import com.lfp.AcmeRopa.Entidades.Promociones;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
public interface PromocionesRepositorios {

    public void deleteById(String promoId);

    public void save(Promociones promocion);

    public Optional<Promociones> findById(String promoId);


    @Repository
    public interface PromocionesRepository extends CrudRepository<Promociones, String>{

        public abstract ArrayList<Promociones> obtenerPorCategoria(String categoria);

    }
}
