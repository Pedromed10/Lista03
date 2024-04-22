package br.edu.up.modelos;

public class Fabrica {
    private double custoFabrica;
    private static final double PERCENTUAL_IMPOSTOS = 0.45;
    private static final double PERCENTUAL_DISTRIBUIDOR = 0.28;

    public Fabrica(double custoFabrica) {
        this.custoFabrica = custoFabrica;
    }

    public double calcularCustoConsumidor() {
        double impostos = custoFabrica * PERCENTUAL_IMPOSTOS;
        double custoSemImpostos = custoFabrica + impostos;
        double custoConsumidor = custoSemImpostos + (custoSemImpostos * PERCENTUAL_DISTRIBUIDOR);
        return custoConsumidor;
    }
}
