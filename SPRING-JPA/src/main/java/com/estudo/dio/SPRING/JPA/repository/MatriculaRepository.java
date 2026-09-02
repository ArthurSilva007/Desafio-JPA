package com.estudo.dio.SPRING.JPA.repository;

import com.estudo.dio.SPRING.JPA.entity.Matricula;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MatriculaRepository extends JpaRepository<Matricula, Long> {

    List<Matricula> findByAlunoBairro (String bairro);
}
