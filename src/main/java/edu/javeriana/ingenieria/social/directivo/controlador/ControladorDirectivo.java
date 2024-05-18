package edu.javeriana.ingenieria.social.directivo.controlador;

import edu.javeriana.ingenieria.social.directivo.dominio.Directivo;
import edu.javeriana.ingenieria.social.directivo.servicio.ServicioDirectivo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/directivos")
@CrossOrigin(origins="http://localhost:4200")
public class ControladorDirectivo {
    @Autowired
    private ServicioDirectivo servicio;

    @GetMapping("listar")
    public List<Directivo> obtenerDirectivos() {
        return servicio.obtenerDirectivos();
    }

    @GetMapping("obtener")
    public ResponseEntity<Directivo> obtenerDirectivo(Integer cedula) {
        if(cedula == null) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        if(!servicio.directivoExiste(cedula)){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(servicio.obtenerDirectivo(cedula), HttpStatus.OK);
    }
}
