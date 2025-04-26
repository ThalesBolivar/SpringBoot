package com.exemplo.springbootcrud.repository;

import com.exemplo.springbootcrud.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}