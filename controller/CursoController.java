package com.bancodealunos.controller;

import com.bancodealunos.entity.Curso;
import com.bancodealunos.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cursos")
public class CursoController {

    @Autowired
    private CursoService cursoService;

    @GetMapping
    public List<Curso> listarCursos() {
        return cursoService.listarTodos();
    }

    @PostMapping
    public Curso criarCurso(@RequestBody Curso curso) {
        return cursoService.salvar(curso);
    }
}
