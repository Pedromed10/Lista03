package br.edu.up.modelos;

public class Automovel {
    private double distanciaPercorrida;
    private double combustivelGasto;

    public Automovel() {
    }

    public double getDistanciaPercorrida() {
        return distanciaPercorrida;
    }

    public void setDistanciaPercorrida(double distanciaPercorrida) {
        this.distanciaPercorrida = distanciaPercorrida;
    }

    public double getCombustivelGasto() {
        return combustivelGasto;
    }

    public void setCombustivelGasto(double combustivelGasto) {
        this.combustivelGasto = combustivelGasto;
    }

    public double calcularConsumoMedio() {
        if (combustivelGasto == 0) {
            return 0;
        }
        return distanciaPercorrida / combustivelGasto;
    }
}
