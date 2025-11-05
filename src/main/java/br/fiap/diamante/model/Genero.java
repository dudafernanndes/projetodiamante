package br.fiap.diamante.model;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import org.springframework.hateoas.EntityModel;

import br.fiap.diamante.controller.GeneroController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Genero {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{genero.nome.notblank}")
    @Size(min = 3, max = 50, message = "{genero.nome.size}")
    private String nome;

    public EntityModel<Genero> toEntityModel() {
        return EntityModel.of(
            this,
            linkTo(methodOn(GeneroController.class).buscarGeneroPorId(id)).withSelfRel(),
            linkTo(GeneroController.class).withRel("generos")
        );
    }
}
