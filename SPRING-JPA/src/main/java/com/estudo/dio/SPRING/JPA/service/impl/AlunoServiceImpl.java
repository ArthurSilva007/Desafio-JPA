package com.estudo.dio.SPRING.JPA.service.impl;

import com.estudo.dio.SPRING.JPA.entity.Aluno;
import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AlunoForm;
import com.estudo.dio.SPRING.JPA.entity.form.AlunoUpdateForm;
import com.estudo.dio.SPRING.JPA.service.AlunoRepository;
import com.estudo.dio.SPRING.JPA.service.IAlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class AlunoServiceImpl implements IAlunoService{

    @Autowired
    private AlunoRepository repository;

    @Override
    public Aluno create(AlunoForm form) {
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataNascimento());

        return repository.save(aluno);
    }

    @Override
    public Aluno get(Long id) {
        return null;
    }

    @Override
    public List<Aluno> getAll(String dataNascimento) {

        if (dataNascimento == null) {
            return repository.findAll();
        } else {
            LocalDate localDate = LocalDate.parse(dataNascimento);
            return repository.findByDataNascimento(localDate);
        }

    }

    @Override
    public Aluno update(Long id, AlunoUpdateForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id) {

        Aluno aluno = repository.findById(id).get();
        return aluno.getAvaliacoes();

    }


}
