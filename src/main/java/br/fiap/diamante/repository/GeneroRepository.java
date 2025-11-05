package br.fiap.diamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.fiap.diamante.model.Genero;

public interface GeneroRepository extends JpaRepository<Genero, Long>, JpaSpecificationExecutor<Genero> {}
