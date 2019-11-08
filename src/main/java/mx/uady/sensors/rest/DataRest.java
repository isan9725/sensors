package mx.uady.sensors.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import mx.uady.sensors.model.Data;
import mx.uady.sensors.repository.DataRepository;
import mx.uady.sensors.service.DataService;

@RestController
public class DataRest {

    @Autowired
    private DataService dataService;

    
    @GetMapping("/data")
    public ResponseEntity< List<Data> > prueba() {
        List<Data> alumnos = dataService.getData();
        return ResponseEntity.ok(alumnos);
    } 

    @PostMapping("/data")
    public ResponseEntity<Data> crearData(@RequestBody Data data) {
        Data a = dataService.crear(data);
        return ResponseEntity.status(HttpStatus.CREATED).body(a);
    }


}