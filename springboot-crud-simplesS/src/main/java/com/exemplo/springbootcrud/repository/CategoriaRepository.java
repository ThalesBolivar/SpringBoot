package com.exemplo.springbootcrud.repository;

import com.exemplo.springbootcrud.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}