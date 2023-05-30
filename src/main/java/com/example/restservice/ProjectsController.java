package com.example.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProjectsController {

    private static final List<String> projectsList = new ArrayList<>(List.of("IndiaEats", "IndiaTravels",
            "Air Traffic Control System"));

    @GetMapping("/projects")
    public Projects projects() {
        return new Projects(projectsList);
    }

    @GetMapping("/mini-projects")
    public Projects miniProjects() {
        return new Projects(List.of("Library Management System", "Hotel Management System", "Grocery Management System"));
    }
}
