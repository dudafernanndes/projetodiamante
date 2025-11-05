package br.fiap.diamante.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
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

    @GetMapping
    public PagedModel<EntityModel<Filme>> getAll(Pageable pageable, PagedResourcesAssembler<Filme> assembler) {
        var page = filmeService.listarFilmes(pageable);
        return assembler.toModel(page, Filme::toEntityModel);
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
