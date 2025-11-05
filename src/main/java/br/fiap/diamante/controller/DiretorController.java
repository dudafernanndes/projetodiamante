package br.fiap.diamante.controller;

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
