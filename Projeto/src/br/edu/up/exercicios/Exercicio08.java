package br.edu.up.exercicios;

import br.edu.up.modelos.SemestreAluno;
import br.edu.up.Prompt;

public class Exercicio08 {
    public void Executar() {
        String nomeAluno = Prompt.lerLinha("Digite o nome do aluno: ");
        double nota1 = Prompt.lerDecimal("Digite a primeira nota: ");
        double nota2 = Prompt.lerDecimal("Digite a segunda nota: ");
        double nota3 = Prompt.lerDecimal("Digite a terceira nota: ");

        SemestreAluno aluno = new SemestreAluno(nomeAluno, nota1, nota2, nota3);
        double media = aluno.calcularMedia();
        String mencao = aluno.obterMencao();

        Prompt.imprimir("Nome do aluno: " + nomeAluno);
        Prompt.imprimir("Média do aluno: " + media);
        Prompt.imprimir("Menção: " + mencao);
    }
}
