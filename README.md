✨ Banco de Dados de Alunos
Este projeto é uma aplicação completa desenvolvida com Java + Spring Boot, que simula um ambiente educacional realista com 1 milhão de alunos, gerados automaticamente e armazenados em um banco de dados MySQL.

Além dos alunos, o sistema conta com cadastro de cursos, relacionamentos entre entidades e uma estrutura pronta para expansão com disciplinas, professores, matrículas e muito mais.

Ideal para testes de performance, benchmark de queries, simulação de big data e projetos acadêmicos.


📚 Funcionalidades
🚀 Geração automática de 1.000.000 alunos usando Java Faker

🔗 Relacionamento Aluno → Curso (muitos para um)

📋 Listagem de alunos por curso

🧠 Consulta por ID e contagem total de registros

🔌 API REST pronta para integração

💾 Persistência com Spring Data JPA e MySQL

🛠️ Estrutura modular e extensível (Service, Repository, Controller)



🛠 Tecnologias Utilizadas
![Java](https://img.shields.io/badge/Java-17-blue)

![Spring Boot](https://img.shields.io/badge/Spring%20Boot-3.1.0-brightgreen)

Spring Data JPA

![MySQL](https://img.shields.io/badge/MySQL-8.0-orange)

![Build](https://img.shields.io/badge/build-passing-brightgreen)

Java Faker

Maven



📦 Estrutura da API
Método	Endpoint	Descrição
GET	/api/alunos/{id}	Buscar aluno por ID
GET	/api/alunos/total	Total de alunos no sistema
GET	/api/cursos	Listar todos os cursos
POST	/api/cursos	Cadastrar novo curso
GET	/api/cursos/{id}/alunos	Listar alunos de um curso


🚀 Como rodar o projeto
Clone o repositório:

bash
Copiar
Editar
git clone https://github.com/zefranco77/banco-de-dados-de-alunos.git
Crie o banco no MySQL:

sql
Copiar
Editar
CREATE DATABASE banco_alunos;
Configure src/main/resources/application.properties com seu usuário e senha do MySQL.

Execute a aplicação:

bash
Copiar
Editar
./mvnw spring-boot:run
⚠️ A geração dos dados pode levar alguns minutos.

🧠 Possibilidades futuras
Entidade Disciplina

Matrícula de alunos em disciplinas (N:N)

Dashboard de relatórios (Spring Actuator / Swagger)

Filtros e paginação

Autenticação e controle de acesso (JWT)

📌 Ideal para
Testes com grandes volumes de dados

Benchmark de queries SQL e Hibernate

Estudos de performance de APIs

Projetos acadêmicos de sistemas escolares

Portfólio de desenvolvedores backend

👨‍💻 Autor
Feito com 💻 e ☕ por José Francisco
