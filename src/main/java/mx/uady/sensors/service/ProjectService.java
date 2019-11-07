package mx.uady.sensors.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mx.uady.sensors.model.Project;
import mx.uady.sensors.repository.ProjectRepository;

@Service
public class ProjectService{

    @Autowired
    private ProjectRepository projectRepository;

    public List< Project > getProject(){
        return projectRepository.findAll();
    }
}