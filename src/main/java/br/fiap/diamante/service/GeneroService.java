package br.fiap.diamante.service;

import org.springframework.stereotype.Service;

import br.fiap.diamante.model.Genero;
import br.fiap.diamante.repository.GeneroRepository;

@Service
public class GeneroService {
    
    private final GeneroRepository generoRepository;

    public GeneroService(GeneroRepository generoRepository) {
        this.generoRepository = generoRepository;
    }

    public Genero postarGenero(Genero genero){
        return generoRepository.save(genero);
    }

    public Genero getGeneroById(Long id) {
        return generoRepository.findById(id).orElse(null);
    }

}
