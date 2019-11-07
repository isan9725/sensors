package mx.uady.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import mx.uady.model.Data;
import mx.uady.repository.DataRepository;
import mx.uady.service.DataService;

@RestController
public class DataRest {

    @Autowired
    private DataService dataService;

    
    // @GetMapping("/alumno")
    // public ResponseEntity< List<Alumno> > prueba() {
    //     List<Alumno> alumnos = alumnoService.getAlumnos();
    //     return ResponseEntity.ok(alumnos);
    // } 

    @PostMapping("/alumno")
    public ResponseEntity<Data> crearAlumno(@RequestBody Data data) {
        Data a = dataService.crear(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(a);
    }


}