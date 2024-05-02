package com.ocorteiz.apifipe.main;

import com.ocorteiz.apifipe.service.ConsumirAPI;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    private Scanner leitura = new Scanner(System.in);
    private final ConsumirAPI consumo = new ConsumirAPI();
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
        System.out.println(json);
    }

}
