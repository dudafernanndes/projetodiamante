package br.fiap.diamante.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.fiap.diamante.model.Genero;
import br.fiap.diamante.service.GeneroService;

@RestController
@RequestMapping("/generos")
public class GeneroController {

    private final GeneroService generoService;

    public GeneroController(GeneroService generoService){
        this.generoService = generoService;
    }

    @GetMapping
    public PagedModel<EntityModel<Genero>> getAll(Pageable pageable, PagedResourcesAssembler<Genero> assembler) {
        var page = generoService.listarGeneros(pageable);
        return assembler.toModel(page, Genero::toEntityModel);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Genero postarGenero(@RequestBody Genero genero) {
        return generoService.postarGenero(genero);
    }

    @GetMapping("/{id}")
    public Genero buscarGeneroPorId(@PathVariable Long id) {
        return generoService.getGeneroById(id);
    }
}
