package br.edu.up.exercicios;

import br.edu.up.modelos.Idade;
import br.edu.up.Prompt;

public class Exercicio10 {
    public void Executar() {
        int quantidadePessoas = Prompt.lerInteiro("Digite a quantidade de pessoas: ");
        Idade[] pessoas = new Idade[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            int idade = Prompt.lerInteiro("Digite a idade da pessoa " + (i + 1) + ": ");
            pessoas[i] = new Idade();
            pessoas[i].setIdade(idade);
        }

        Prompt.linhaEmBranco();
        Prompt.imprimir("Classificação das pessoas:");
        for (int i = 0; i < quantidadePessoas; i++) {
            int idade = pessoas[i].getIdade();
            String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
            Prompt.imprimir("Pessoa " + (i + 1) + ": " + mensagem);
        }
    }
}
