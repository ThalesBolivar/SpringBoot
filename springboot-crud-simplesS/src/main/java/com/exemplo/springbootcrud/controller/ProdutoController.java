package com.exemplo.springbootcrud.controller;

import com.exemplo.springbootcrud.model.Produto;
import com.exemplo.springbootcrud.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> listar() {
        return produtoRepository.findAll();
    }

    @PostMapping
    public Produto adicionar(@RequestBody Produto produto) {
        return produtoRepository.save(produto);
    }
}