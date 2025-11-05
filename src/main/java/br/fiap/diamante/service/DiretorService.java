package br.fiap.diamante.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import br.fiap.diamante.model.Diretor;
import br.fiap.diamante.repository.DiretorRepository;

@Service
public class DiretorService {
    
    private final DiretorRepository diretorRepository;

    public DiretorService(DiretorRepository diretorRepository) {
        this.diretorRepository = diretorRepository;
    }

    public Page<Diretor> listarDiretores(Pageable pageable) {
        return diretorRepository.findAll(pageable);
    }

    public Diretor postarDiretor(Diretor diretor){
        return diretorRepository.save(diretor);
    }

    public Diretor getDiretorById(Long id) {
        return diretorRepository.findById(id).orElse(null);
    }

}
