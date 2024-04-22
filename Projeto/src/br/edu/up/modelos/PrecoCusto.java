package br.edu.up.modelos;

public class PrecoCusto {
    private double precoCusto;

    public PrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double calcularPrecoVenda(double percentualAumento) {
        double aumento = precoCusto * (percentualAumento / 100.0);
        return precoCusto + aumento;
    }
}
