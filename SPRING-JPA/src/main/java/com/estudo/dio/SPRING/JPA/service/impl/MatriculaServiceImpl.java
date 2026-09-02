package com.estudo.dio.SPRING.JPA.service.impl;

import com.estudo.dio.SPRING.JPA.entity.Aluno;
import com.estudo.dio.SPRING.JPA.entity.Matricula;
import com.estudo.dio.SPRING.JPA.entity.form.MatriculaForm;
import com.estudo.dio.SPRING.JPA.repository.MatriculaRepository;
import com.estudo.dio.SPRING.JPA.service.AlunoRepository;
import com.estudo.dio.SPRING.JPA.service.IMatriculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MatriculaServiceImpl implements IMatriculaService {

    @Autowired
    private MatriculaRepository matriculaRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public Matricula create(MatriculaForm form) {
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        Matricula matricula = new Matricula();
        matricula.setAluno(aluno);

        return matriculaRepository.save(matricula);
    }

    @Override
    public Matricula get(Long id) {
        return matriculaRepository.findById(id).get();
    }

    @Override
    public List<Matricula> getAll() {
        return matriculaRepository.findAll();
    }

    @Override
    public void delete(Long id) {
        matriculaRepository.deleteById(id);
    }
}
