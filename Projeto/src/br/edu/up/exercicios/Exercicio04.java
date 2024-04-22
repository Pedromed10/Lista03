package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Conversao;

public class Exercicio04 {
    public void Executar() {

        double cotacaoDolar = Prompt.lerDecimal("Digite a cotação do dólar (em R$): ");

        double quantidadeDolares = Prompt.lerDecimal("Digite a quantidade de dólares disponíveis: ");

        Conversao conversao = new Conversao(cotacaoDolar, quantidadeDolares);

        double valorEmReais = conversao.converterParaReais();
        Prompt.imprimir("O valor em reais é: R$" + valorEmReais);
    }
}
