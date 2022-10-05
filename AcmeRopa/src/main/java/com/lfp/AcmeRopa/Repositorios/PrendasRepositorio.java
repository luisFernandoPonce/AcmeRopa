package com.lfp.AcmeRopa.Repositorios;


import com.lfp.AcmeRopa.Entidades.Prendas;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

    @Repository
    public interface PrendasRepositorio extends CrudRepository<Prendas, String> {

        public abstract ArrayList<Prendas> obtenerPorCategoria(String categoria);
    }

