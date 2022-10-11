package strategy.frete.preRefactor;

import strategy.frete.Fretavel;

public class CalculadoraFrete {

    public double calcularValor(Fretavel fretavel, double pesoEmKg){
        return fretavel.calcularValor(pesoEmKg);
    }

}
