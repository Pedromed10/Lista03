package br.edu.up.modelos;

public class Conversao {
    private double cotacaoDolar;
    private double quantidadeDolares;

    // Construtor
    public Conversao(double cotacaoDolar, double quantidadeDolares) {
        this.cotacaoDolar = cotacaoDolar;
        this.quantidadeDolares = quantidadeDolares;
    }

    // Getters e setters
    public double getCotacaoDolar() {
        return cotacaoDolar;
    }

    public void setCotacaoDolar(double cotacaoDolar) {
        this.cotacaoDolar = cotacaoDolar;
    }

    public double getQuantidadeDolares() {
        return quantidadeDolares;
    }

    public void setQuantidadeDolares(double quantidadeDolares) {
        this.quantidadeDolares = quantidadeDolares;
    }

    // Método para converter dólares para reais
    public double converterParaReais() {
        return cotacaoDolar * quantidadeDolares;
    }
}