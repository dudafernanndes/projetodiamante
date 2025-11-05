package br.fiap.diamante.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import br.fiap.diamante.filter.DiretorSpecification;
import br.fiap.diamante.model.Diretor;
import br.fiap.diamante.model.DiretorFilters;
import br.fiap.diamante.repository.DiretorRepository;

@Service
public class DiretorService {
    
    private final DiretorRepository diretorRepository;

    public DiretorService(DiretorRepository diretorRepository) {
        this.diretorRepository = diretorRepository;
    }

    public Page<Diretor> listarDiretores(Pageable pageable, DiretorFilters filters) {
        Specification<Diretor> spec = DiretorSpecification.build(filters);
        return diretorRepository.findAll(spec, pageable);
    }

    public Diretor postarDiretor(Diretor diretor){
        return diretorRepository.save(diretor);
    }

    public Diretor getDiretorById(Long id) {
        return diretorRepository.findById(id).orElse(null);
    }

}
