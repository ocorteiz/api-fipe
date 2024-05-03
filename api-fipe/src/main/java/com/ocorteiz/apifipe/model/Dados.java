package com.ocorteiz.apifipe.model;

public record Dados(
    String codigo,
    String nome
) {
    public Integer getCodigoInt() {
        return Integer.valueOf(codigo);
    }

}
