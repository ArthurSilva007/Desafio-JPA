package com.estudo.dio.SPRING.JPA.service;

import com.estudo.dio.SPRING.JPA.entity.Matricula;
import com.estudo.dio.SPRING.JPA.entity.form.MatriculaForm;

import java.util.List;

public interface IMatriculaService {

    Matricula create(MatriculaForm form);

    Matricula get(Long id);

    List<Matricula> getAll();

    void delete( Long id);
}
