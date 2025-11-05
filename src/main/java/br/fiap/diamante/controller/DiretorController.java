package br.fiap.diamante.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
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
    public Page<Diretor> getAll(@PageableDefault(size = 10, sort = "nome", direction = Direction.ASC) Pageable pageable) {
        return diretorService.listarDiretores(pageable);
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
