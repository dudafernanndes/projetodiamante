package br.fiap.diamante.filter;

import org.springframework.data.jpa.domain.Specification;
import br.fiap.diamante.model.Filme;
import br.fiap.diamante.model.FilmeFilters;

public class FilmeSpecification {

    public static Specification<Filme> build(FilmeFilters filters) {
        Specification<Filme> spec = Specification.anyOf();

        if (filters == null) {
            return spec;
        }

        if (filters.titulo() != null && !filters.titulo().isBlank()) {
            spec = spec.and((root, query, cb) ->
                cb.like(cb.upper(root.get("titulo")), "%" + filters.titulo().toUpperCase() + "%")
            );
        }

        if (filters.minNota() != null) {
            spec = spec.and((root, query, cb) ->
                cb.greaterThanOrEqualTo(root.get("notaImbd"), filters.minNota())
            );
        }

        if (filters.maxNota() != null) {
            spec = spec.and((root, query, cb) ->
                cb.lessThanOrEqualTo(root.get("notaImbd"), filters.maxNota())
            );
        }

        if (filters.anoLancamentoInicio() != null) {
            spec = spec.and((root, query, cb) ->
                cb.greaterThanOrEqualTo(root.get("anoLancamento"), filters.anoLancamentoInicio())
            );
        }

        if (filters.anoLancamentoFim() != null) {
            spec = spec.and((root, query, cb) ->
                cb.lessThanOrEqualTo(root.get("anoLancamento"), filters.anoLancamentoFim())
            );
        }

        if (filters.diretorId() != null) {
            spec = spec.and((root, query, cb) ->
                cb.equal(root.get("diretor").get("id"), filters.diretorId())
            );
        }

        if (filters.generoId() != null) {
            spec = spec.and((root, query, cb) ->
                cb.equal(root.get("genero").get("id"), filters.generoId())
            );
        }

        return spec;
    }
}
