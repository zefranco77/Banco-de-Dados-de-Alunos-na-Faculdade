@GetMapping("/{id}/alunos")
public List<Aluno> listarAlunosPorCurso(@PathVariable Long id) {
    Curso curso = cursoService.buscarPorId(id);
    return curso.getAlunos();
}
