package strategy.frete.preRefactor;

import strategy.frete.Fretavel;

public class CalculadoraFrete {

    public double calculaValor(Fretavel fretavel, double pesoEmKg){
        return fretavel.calculaValor(pesoEmKg);
    }

}
