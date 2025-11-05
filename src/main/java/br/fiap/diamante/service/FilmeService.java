package br.fiap.diamante.service;

import org.springframework.stereotype.Service;

import br.fiap.diamante.model.Filme;
import br.fiap.diamante.repository.FilmeRepository;

@Service
public class FilmeService {
    
    private final FilmeRepository filmeRepository;

    public FilmeService(FilmeRepository filmeRepository) {
        this.filmeRepository = filmeRepository;
    }

    public Filme postarFilme(Filme filme){
        return filmeRepository.save(filme);
    }

    public Filme getFilmeById(Long id) {
        return filmeRepository.findById(id).orElse(null);
    }

}  
