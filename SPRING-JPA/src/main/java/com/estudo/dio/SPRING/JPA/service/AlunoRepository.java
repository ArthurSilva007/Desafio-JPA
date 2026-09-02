package com.estudo.dio.SPRING.JPA.service;

import com.estudo.dio.SPRING.JPA.entity.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {


    List<Aluno> findByDataNascimento(LocalDate dataNascimento);
}
