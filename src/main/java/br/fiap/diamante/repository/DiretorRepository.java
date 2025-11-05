package br.fiap.diamante.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.fiap.diamante.model.Diretor;

public interface DiretorRepository extends JpaRepository<Diretor, Long>, JpaSpecificationExecutor<Diretor> {}
