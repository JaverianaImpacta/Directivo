package edu.javeriana.ingenieria.social.directivo.servicio;

import edu.javeriana.ingenieria.social.directivo.dominio.Directivo;
import edu.javeriana.ingenieria.social.directivo.repositorio.RepositorioDirectivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServicioDirectivo {
    @Autowired
    private RepositorioDirectivo repositorio;

    public List<Directivo> obtenerDirectivos(){
        return repositorio.findAll();
    }

    public Directivo obtenerDirectivo(Integer cedula){
        return repositorio.findOneByCedula(cedula);
    }

    public boolean directivoExiste(Integer cedula){
        return repositorio.existsByCedula(cedula);
    }
}
