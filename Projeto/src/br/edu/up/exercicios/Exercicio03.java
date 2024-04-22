package br.edu.up.exercicios;

import br.edu.up.modelos.*;
import br.edu.up.*;

public class Exercicio03 {

    public void Executar() {

        Vendedor vendedor = new Vendedor("Joao", 2000.0, 5000.0);

        Prompt.imprimir("Nome do vendedor: " + vendedor.getNome());
        Prompt.imprimir("Salário fixo: R$" + vendedor.getSalarioFixo());
        Prompt.imprimir("Salário no final do mês: R$" + vendedor.calcularSalarioFinal());
    }
}
