package br.fiap.diamante.filter;

import org.springframework.data.jpa.domain.Specification;
import br.fiap.diamante.model.Genero;
import br.fiap.diamante.model.GeneroFilters;

public class GeneroSpecification {

    public static Specification<Genero> build(GeneroFilters filters) {
        Specification<Genero> spec = Specification.anyOf();

        if (filters == null) {
            return spec;
        }

        if (filters.nome() != null && !filters.nome().isBlank()) {
            spec = spec.and((root, query, cb) ->
                cb.like(cb.upper(root.get("nome")), "%" + filters.nome().toUpperCase() + "%")
            );
        }

        return spec;
    }
}
