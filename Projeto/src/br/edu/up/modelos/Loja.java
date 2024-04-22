package br.edu.up.modelos;

public class Loja {
    private static final int NUMERO_PRESTACOES = 5;

    public double[] calcularPrestacoes(double valorCompra) {
        double[] prestacoes = new double[NUMERO_PRESTACOES];
        double valorPrestacao = valorCompra / NUMERO_PRESTACOES;

        for (int i = 0; i < NUMERO_PRESTACOES; i++) {
            prestacoes[i] = valorPrestacao;
        }

        return prestacoes;
    }

    public static int getNumeroPrestacoes() {
        return NUMERO_PRESTACOES;
    }
}
