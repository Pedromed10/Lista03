package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Loja;

public class Exercicio05 {
    public void Executar() {
        double valorCompra = Prompt.lerDecimal("Digite o valor da compra: ");

        Loja loja = new Loja();
        double[] prestacoes = loja.calcularPrestacoes(valorCompra);

        Prompt.imprimir("O valor das prestações é:");
        for (int i = 0; i < prestacoes.length; i++) {
            Prompt.imprimir("Prestação " + (i + 1) + ": R$" + prestacoes[i]);
        }
    }
}
