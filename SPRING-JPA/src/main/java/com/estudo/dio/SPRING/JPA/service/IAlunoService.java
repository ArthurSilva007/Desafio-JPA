package com.estudo.dio.SPRING.JPA.service;

import com.estudo.dio.SPRING.JPA.entity.Aluno;
import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AlunoForm;
import com.estudo.dio.SPRING.JPA.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

    Aluno create(AlunoForm form);

    Aluno get(Long id);

    List<Aluno> getAll(String dataNascimento);

    Aluno update( Long id, AlunoUpdateForm formUpdate);

    void delete(Long id);

    List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
