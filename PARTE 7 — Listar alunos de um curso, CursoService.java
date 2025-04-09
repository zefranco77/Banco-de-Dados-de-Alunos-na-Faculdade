public Curso buscarPorId(Long id) {
    return cursoRepository.findById(id).orElseThrow(() -> new RuntimeException("Curso não encontrado"));
}
