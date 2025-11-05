package br.fiap.diamante.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.fiap.diamante.filter.FilmeSpecification;
import br.fiap.diamante.model.Filme;
import br.fiap.diamante.model.FilmeFilters;
import br.fiap.diamante.repository.FilmeRepository;

@Service
public class FilmeService {
    
    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public Page<Filme> listarFilmes(Pageable pageable, FilmeFilters filters) {
        Specification<Filme> spec = FilmeSpecification.build(filters);
        return filmeRepository.findAll(spec, pageable);
    }

    public Filme postarFilme(Filme filme){
        return filmeRepository.save(filme);
    }

    public Filme getFilmeById(Long id) {
        return filmeRepository.findById(id).orElse(null);
    }

}  
