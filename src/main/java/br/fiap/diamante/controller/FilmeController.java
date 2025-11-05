package br.fiap.diamante.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.fiap.diamante.model.Filme;
import br.fiap.diamante.service.FilmeService;

@RestController
@RequestMapping("/filmes")
public class FilmeController {
    
    private final FilmeService filmeService;

    public FilmeController(FilmeService filmeService){
        this.filmeService = filmeService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Filme postarFilme(@RequestBody Filme filme) {
        return filmeService.postarFilme(filme);
    }

    @GetMapping("/{id}")
    public Filme buscarFilmePorId(@PathVariable Long id) {
        return filmeService.getFilmeById(id);
    }
}
