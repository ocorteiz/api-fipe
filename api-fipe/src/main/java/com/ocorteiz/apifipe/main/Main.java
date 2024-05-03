package com.ocorteiz.apifipe.main;

import com.ocorteiz.apifipe.model.Dados;
import com.ocorteiz.apifipe.model.Modelos;
import com.ocorteiz.apifipe.service.ConsumirAPI;
import com.ocorteiz.apifipe.service.ConverterDados;

import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private Scanner leitura = new Scanner(System.in);
    private final ConsumirAPI consumo = new ConsumirAPI();
    private final ConverterDados converterDados = new ConverterDados();
    private final String URL_BASE = "https://parallelum.com.br/fipe/api/v1";

    public void exibeMenu(){
        String menu = """
                \n--- ESCOLHA UM TIPO DE VEICULO --- 
                      
                1 - CARRO
                2 - MOTO
                3 - CAMINHÃO
                
                ----------------------------------
                """;
        System.out.println(menu);
        var opcao = leitura.nextLine();
        String endereco = null;

        if (opcao.toLowerCase().contains("carr")) {
            endereco = URL_BASE + "/carros/marcas";
        } else if (opcao.toLowerCase().contains("mot")) {
            endereco = URL_BASE + "/motos/marcas";
        } else if (opcao.toLowerCase().contains("caminh")) {
            endereco = URL_BASE + "/caminhoes/marcas";
        }

        var json = consumo.obterDados(endereco);
        var marcasList = converterDados.obterLista(json, Dados.class);
        marcasList.stream()
                .sorted(Comparator.comparing(Dados::getCodigoInt))
                .forEach(System.out::println);


        System.out.println("\nDigite o codigo da marca: ");
        var codigoMarca = leitura.nextLine();
        endereco = endereco + "/" + codigoMarca + "/modelos";
        System.out.println(endereco);
        json = consumo.obterDados(endereco);
        var modelosList = converterDados.obterDados(json, Modelos.class);
        modelosList.modelos().stream()
                .sorted(Comparator.comparing(Dados::getCodigoInt))
                .forEach(System.out::println);

    }

}
