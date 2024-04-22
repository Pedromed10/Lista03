package br.edu.up.exercicios;

import br.edu.up.Prompt;
import br.edu.up.modelos.Aluno;

public class Exercicio01 {
    public void Executar() {

        String nome = "João";
        double nota1 = 7.5;
        double nota2 = 8.0;
        double nota3 = 6.5;

        Aluno aluno = new Aluno(nome, nota1, nota2, nota3);

        double media = aluno.calcularMedia();

        Prompt.separador();
        Prompt.imprimir("Nome do aluno: " + aluno.nome);
        Prompt.imprimir("Média: " + media);
    }
}
