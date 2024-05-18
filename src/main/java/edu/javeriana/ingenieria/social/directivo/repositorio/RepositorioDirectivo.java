package edu.javeriana.ingenieria.social.directivo.repositorio;

import edu.javeriana.ingenieria.social.directivo.dominio.Directivo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDirectivo extends JpaRepository<Directivo, Integer> {
    Directivo findOneByCedula(Integer cedula);

    boolean existsByCedula(Integer cedula);
}
