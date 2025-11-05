package br.fiap.diamante.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.PagedModel;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import br.fiap.diamante.model.Diretor;
import br.fiap.diamante.service.DiretorService;

@RestController
@RequestMapping("/diretores")
public class DiretorController {
    
    private final DiretorService diretorService;

    public DiretorController(DiretorService diretorService){
        this.diretorService = diretorService;
    }

    @GetMapping
    public PagedModel<EntityModel<Diretor>> getAll(Pageable pageable, PagedResourcesAssembler<Diretor> assembler) {
        var page = diretorService.listarDiretores(pageable);
        return assembler.toModel(page, Diretor::toEntityModel);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Diretor postarDiretor(@RequestBody Diretor diretor) {
        return diretorService.postarDiretor(diretor);
    }

    @GetMapping("/{id}")
    public Diretor buscarDiretorPorId(@PathVariable Long id) {
        return diretorService.getDiretorById(id);
    }
    
}
