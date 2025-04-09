Atualizar o gerador de alunos para vincular cursos
No GeradorDeAlunos.java:

Injete o CursoRepository:

java
Copiar
Editar
@Autowired
private CursoRepository cursoRepository;
Antes do for, crie alguns cursos:

java
Copiar
Editar
List<Curso> cursos = List.of(
    new Curso(null, "Ciência da Computação", "CC"),
    new Curso(null, "Engenharia Elétrica", "EE"),
    new Curso(null, "Administração", "ADM"),
    new Curso(null, "Direito", "DIR")
);
cursoRepository.saveAll(cursos);
Dentro do for, adicione:

java
Copiar
Editar
aluno.setCurso(cursos.get(faker.random().nextInt(cursos.size())));
