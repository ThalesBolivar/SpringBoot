package com.exemplo.springbootcrud.controller;

import com.exemplo.springbootcrud.model.Categoria;
import com.exemplo.springbootcrud.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping
    public List<Categoria> listar() {
        return categoriaRepository.findAll();
    }

    @PostMapping
    public Categoria adicionar(@RequestBody Categoria categoria) {
        return categoriaRepository.save(categoria);
    }
}