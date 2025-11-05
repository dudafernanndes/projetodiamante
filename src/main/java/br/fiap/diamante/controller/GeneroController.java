package br.fiap.diamante.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
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
    public Page<Genero> getAll(
            @PageableDefault(size = 10, sort = "nome", direction = Direction.ASC) Pageable pageable
    ) {
        return generoService.listarGeneros(pageable);
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
