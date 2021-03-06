package mx.uady.sensors.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mx.uady.sensors.model.Project;

@Repository
public interface ProjectRepository extends JpaRepository< Project, Integer >{
    
}