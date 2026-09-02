package com.estudo.dio.SPRING.JPA.controller;

import com.estudo.dio.SPRING.JPA.entity.Aluno;
import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AlunoForm;
import com.estudo.dio.SPRING.JPA.service.impl.AlunoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoServiceImpl service;

   @PostMapping
    public Aluno create(@RequestBody AlunoForm form){
       return  service.create(form);
   }


   @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
       return service.getAllAvaliacaoFisicaId(id);
   }

   @GetMapping
    public List<Aluno> getAll(@RequestParam(value = "dataDeNascimento", required = false )
                                 String dataDeNascimento){
       return service.getAll(dataDeNascimento);
   }

}
