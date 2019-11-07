package mx.uady.sensors.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.uady.sensors.model.Project;
import mx.uady.sensors.service.ProjectService;

@RestController
public class ProjectRest{

    @Autowired
    private ProjectService projectService;

    @GetMapping("/project")
    public ResponseEntity< List<Project> > listProjects(){
        List<Project> project = projectService.getProject();
        return ResponseEntity.ok(project);
    }

}