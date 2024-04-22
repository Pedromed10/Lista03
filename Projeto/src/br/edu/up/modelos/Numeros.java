package br.edu.up.modelos;

import java.util.ArrayList;
import java.util.List;

public class Numeros {
    private List<Double> numeros;

    public Numeros() {
        this.numeros = new ArrayList<>();
    }

    public void adicionarNumero(double numero) {
        numeros.add(numero);
    }

    public int contarNumerosNoIntervalo(double limiteInferior, double limiteSuperior) {
        int quantidade = 0;
        for (double numero : numeros) {
            if (numero >= limiteInferior && numero <= limiteSuperior) {
                quantidade++;
            }
        }
        return quantidade;
    }

    public List<Double> getNumeros() {
        return numeros;
    }

    public void setNumeros(List<Double> numeros) {
        this.numeros = numeros;
    }
}
