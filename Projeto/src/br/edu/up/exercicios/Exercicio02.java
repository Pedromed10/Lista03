package br.edu.up.exercicios;

import br.edu.up.modelos.Automovel;
import br.edu.up.Prompt;

public class Exercicio02 {
    public void Executar(){

        double distanciaPercorrida = Prompt.lerDecimal("Digite a distância total percorrida (em km): ");
        double combustivelGasto = Prompt.lerDecimal("Digite o total de combustível gasto (em litros): ");

        Automovel automovel = new Automovel();

        automovel.setDistanciaPercorrida(distanciaPercorrida);
        automovel.setCombustivelGasto(combustivelGasto);

        double consumoMedio = automovel.calcularConsumoMedio();
        Prompt.imprimir("O consumo médio do automóvel é: " + consumoMedio + " km/l");
    }
}
