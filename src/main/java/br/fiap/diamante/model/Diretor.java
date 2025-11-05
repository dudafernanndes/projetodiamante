package br.fiap.diamante.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Diretor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{diretor.nome.notblank}")
    @Size(min = 2, max = 100, message = "{diretor.nome.size}")
    private String nome;
    
    @NotBlank(message = "{diretor.nacionalidade.notblank}")
    @Size(min = 2, max = 50, message = "{diretor.nacionalidade.size}")
    private String nacionalidade;
}