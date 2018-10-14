package com.aulas.reports.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aulas.reports.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
