package com.estudo.dio.SPRING.JPA.service;

import com.estudo.dio.SPRING.JPA.entity.AvaliacaoFisica;
import com.estudo.dio.SPRING.JPA.entity.form.AvaliacaoFisicaForm;

import java.util.List;

public interface IAvaliacaoFisicaService {

     AvaliacaoFisica create(AvaliacaoFisicaForm form);

     AvaliacaoFisica get(Long id);

     List<AvaliacaoFisica> getAll();

     AvaliacaoFisica update(Long id,AvaliacaoFisicaForm formUpdate);

     void delete(Long id);
}
