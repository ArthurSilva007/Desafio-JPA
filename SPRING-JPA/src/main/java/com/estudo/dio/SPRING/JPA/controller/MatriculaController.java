package com.estudo.dio.SPRING.JPA.controller;

import com.estudo.dio.SPRING.JPA.entity.Matricula;
import com.estudo.dio.SPRING.JPA.entity.form.MatriculaForm;
import com.estudo.dio.SPRING.JPA.service.IMatriculaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/matriculas")
public class MatriculaController {

    @Autowired
    private IMatriculaServiceImpl service;

    @PostMapping
    public Matricula create(@Valid @RequestBody MatriculaForm form) {
        return service.create(form);
    }

    @GetMapping
    public List<Matricula> getAll(@RequestParam(value = "bairro", required = false) String bairro) {
        return service.getAll(bairro);
    }
}
