package br.fiap.diamante.model;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import java.time.LocalDate;

import org.springframework.hateoas.EntityModel;

import br.fiap.diamante.controller.FilmeController;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Filme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "{filme.titulo.notblank}")
    @Size(min = 1, max = 200, message = "{filme.titulo.size}")
    private String titulo;

    @NotNull(message = "{filme.anoLancamento.notNull}")
    @PastOrPresent(message = "{filme.anoLancamento.pastorpresent}")
    private LocalDate anoLancamento;

    @DecimalMin(value = "0.0", inclusive = true, message = "{filme.nota.decimalmin}")
    @DecimalMax(value = "10.0", inclusive = true, message = "{filme.nota.decimalmax}")
    private Double notaImbd;

    @NotNull(message = "{filme.diretor.notNull}")
    @ManyToOne
    @JoinColumn(name = "diretor_id")
    private Diretor diretor;

    @NotNull(message = "{filme.genero.notNull}")
    @ManyToOne
    @JoinColumn(name = "genero_id")
    private Genero genero;

    public EntityModel<Filme> toEntityModel() {
        return EntityModel.of(
            this,
            linkTo(methodOn(FilmeController.class).buscarFilmePorId(id)).withSelfRel(),
            linkTo(methodOn(FilmeController.class).getAll(null, null)).withRel("filmes")
        );
    }
}
