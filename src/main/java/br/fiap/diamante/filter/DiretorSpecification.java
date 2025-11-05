package br.fiap.diamante.filter;

import org.springframework.data.jpa.domain.Specification;
import br.fiap.diamante.model.Diretor;
import br.fiap.diamante.model.DiretorFilters;

public class DiretorSpecification {

    public static Specification<Diretor> build(DiretorFilters filters) {
        Specification<Diretor> spec = Specification.anyOf();

        if (filters == null) {
            return spec;
        }

        if (filters.nome() != null && !filters.nome().isBlank()) {
            spec = spec.and((root, query, cb) ->
                cb.like(cb.upper(root.get("nome")), "%" + filters.nome().toUpperCase() + "%")
            );
        }

        if (filters.nacionalidade() != null && !filters.nacionalidade().isBlank()) {
            spec = spec.and((root, query, cb) ->
                cb.like(cb.upper(root.get("nacionalidade")), "%" + filters.nacionalidade().toUpperCase() + "%")
            );
        }

        return spec;
    }
}
