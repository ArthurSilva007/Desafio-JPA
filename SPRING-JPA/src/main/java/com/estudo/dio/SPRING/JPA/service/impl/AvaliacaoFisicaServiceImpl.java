package com.estudo.dio.SPRING.JPA.service.impl;


import com.estudo.dio.SPRING.JPA.entity.Aluno;
import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AvaliacaoFisicaForm;
import com.estudo.dio.SPRING.JPA.repository.AvaliacaoFisicaRepository;
import com.estudo.dio.SPRING.JPA.service.AlunoRepository;
import com.estudo.dio.SPRING.JPA.service.IAvaliacaoFisicaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaServiceImpl implements IAvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository repository;

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public AvaliacaoFisica create(AvaliacaoFisicaForm form) {
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());


        return repository.save(avaliacaoFisica);
    }

    @Override
    public AvaliacaoFisica get(Long id) {
        return null;
    }

    @Override
    public List<AvaliacaoFisica> getAll() {
        return List.of();
    }

    @Override
    public AvaliacaoFisica update(Long id, AvaliacaoFisicaForm formUpdate) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
