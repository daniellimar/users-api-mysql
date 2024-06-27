package com.daniellimar.client.demo.controller;

import com.daniellimar.client.demo.model.Professor;
import com.daniellimar.client.demo.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/professores")
public class ProfessorController {

    @Autowired
    private ProfessorService professorService;

    @GetMapping
    public List<Professor> listarTodos() {
        return professorService.listarTodos();
    }
}