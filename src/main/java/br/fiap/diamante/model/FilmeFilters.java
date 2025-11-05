package br.fiap.diamante.model;

import java.time.LocalDate;

public record FilmeFilters(
    String titulo,
    Double minNota,
    Double maxNota,
    LocalDate anoLancamentoInicio,
    LocalDate anoLancamentoFim,
    Long diretorId,
    Long generoId
) {}
