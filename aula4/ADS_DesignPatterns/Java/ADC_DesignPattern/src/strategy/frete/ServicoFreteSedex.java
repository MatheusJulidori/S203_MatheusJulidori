package strategy.frete;

public class ServicoFreteSedex implements Fretavel {

    @Override
    public double calcularValor(double pesoEmKg) {
        //sedex
            if (pesoEmKg < 10.0) {
                return 50.0;
            } else if (pesoEmKg < 20.0) {
                return 70.0;
            } else {
                return 90.0;
            }
        }

}
