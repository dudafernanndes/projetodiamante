package br.fiap.diamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.fiap.diamante.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>, JpaSpecificationExecutor<Filme> {

}
