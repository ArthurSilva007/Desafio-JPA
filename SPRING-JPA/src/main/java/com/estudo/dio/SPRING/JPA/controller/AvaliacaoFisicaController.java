package com.estudo.dio.SPRING.JPA.controller;

import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AvaliacaoFisicaForm;
import com.estudo.dio.SPRING.JPA.service.IAvaliacaoFisicaService;
import com.estudo.dio.SPRING.JPA.service.impl.AvaliacaoFisicaServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoFisicaController {

    @Autowired
    private AvaliacaoFisicaServiceImpl service;

    @PostMapping
    public AvaliacaoFisica create(@RequestBody AvaliacaoFisicaForm form) {
        return service.create(form);
    }


}
