package br.edu.up.exercicios;

import br.edu.up.modelos.Numeros;
import br.edu.up.Prompt;

public class Exercicio09 {
    public void Executar() {
        Numeros numeros = new Numeros();

        for (int i = 1; i <= 80; i++) {
            double numero = Prompt.lerDecimal("Digite o número " + i + ": ");
            numeros.adicionarNumero(numero);
        }

        int quantidadeNoIntervalo = numeros.contarNumerosNoIntervalo(10, 150);

        Prompt.imprimir("Quantidade de números no intervalo [10, 150]: " + quantidadeNoIntervalo);
    }
}
