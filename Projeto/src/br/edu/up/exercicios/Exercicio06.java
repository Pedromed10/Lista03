package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.PrecoCusto;

public class Exercicio06 {
    public void Executar() {
        double precoCusto = Prompt.lerDecimal("Digite o preço de custo do produto: ");
        double percentualAumento = Prompt.lerDecimal("Digite o percentual de aumento (%): ");

        PrecoCusto preco = new PrecoCusto(precoCusto);
        double precoVenda = preco.calcularPrecoVenda(percentualAumento);

        Prompt.imprimir("O preço de venda do produto é: R$" + precoVenda);
    }
}
