package br.edu.up.exercicios;

import br.edu.up.modelos.Fabrica;
import br.edu.up.Prompt;

public class Exercicio07 {
    public void Executar() {
        double custoFabrica = Prompt.lerDecimal("Digite o custo de fábrica do carro: ");

        Fabrica fabrica = new Fabrica(custoFabrica);
        double custoConsumidor = fabrica.calcularCustoConsumidor();

        Prompt.imprimir("O custo ao consumidor do carro é: R$" + custoConsumidor);
    }
}
