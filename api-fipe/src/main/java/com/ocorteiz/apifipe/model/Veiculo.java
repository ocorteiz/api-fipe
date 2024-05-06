package com.ocorteiz.apifipe.model;

public record Veiculo(
        String TipoVeiculo,
        String Valor,
        String Marca,
        String Modelo,
        int AnoModelo,
        String Combustivel,
        String CodigoFipe,
        String MesReferencia,
        String SiglaCombustivel
) {

    @Override
    public String toString() {
        return  "\nValor = " + Valor + '\n' +
                "Marca = " + Marca + '\n' +
                "Modelo = " + Modelo + '\n' +
                "Combustivel = " + Combustivel + '\n' +
                "Codigo Fipe = " + CodigoFipe + '\n' +
                "Mes de Referencia = " + MesReferencia + '\n' +
                "Sigla de Combustivel = " + SiglaCombustivel + '\n';
    }
}
