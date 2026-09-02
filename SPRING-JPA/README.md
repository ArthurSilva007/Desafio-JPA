# SPRING-JPA

API REST de academia desenvolvida com **Spring Boot**, **Spring Data JPA** e **PostgreSQL**.

## Sobre o projeto

O projeto gerencia três domínios principais:

- **Aluno**: cadastro e consulta de alunos.
- **Avaliação Física**: registro de avaliações por aluno.
- **Matrícula**: vínculo de um aluno com a academia.

## Tecnologias usadas

- Java 21
- Spring Boot
- Spring Web
- Spring Data JPA
- Bean Validation (Jakarta Validation)
- PostgreSQL
- Lombok

## Estrutura de pacotes

- `controller`: endpoints REST.
- `service` e `service.impl`: contratos e regras de negócio.
- `repository`: acesso a dados com JPA.
- `entity`: entidades persistidas no banco.
- `entity.form`: objetos de entrada dos endpoints.

## Endpoints principais

### Alunos

- `POST /alunos`  
  Cria um aluno.
- `GET /alunos?dataDeNascimento=yyyy-MM-dd`  
  Lista alunos (com filtro opcional por data de nascimento).
- `GET /alunos/avaliacoes/{id}`  
  Lista avaliações físicas de um aluno.

### Avaliações físicas

- `POST /avaliacoes`  
  Cria uma avaliação física para um aluno.

### Matrículas

- `POST /matriculas`  
  Cria uma matrícula para um aluno.
- `GET /matriculas?bairro={bairro}`  
  Lista matrículas (com filtro opcional por bairro).

## Configuração

As configurações atuais estão em `src/main/resources/application.yml` com PostgreSQL local.

Exemplo:

```yml
spring:
  datasource:
    url: jdbc:postgresql://localhost:5432/academia
    username: postgres
    password: 1234
```

> Recomendado: substituir credenciais fixas por variáveis de ambiente.

## Como executar

1. Suba um PostgreSQL local e crie o banco `academia`.
2. Ajuste `application.yml` conforme seu ambiente.
3. Execute:

```bash
mvn spring-boot:run
```

A aplicação iniciará na porta padrão do Spring Boot (`8080`), salvo configuração diferente.

## Observação

Este projeto está em desenvolvimento e possui partes ainda não finalizadas em alguns serviços/controllers.
