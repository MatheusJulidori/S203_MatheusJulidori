package strategy.frete;

public class ServicoFreteDHL implements Fretavel {

    @Override
    public double calcularValor(double pesoEmKg) {
        if (pesoEmKg < 10.0) {
            return 52.0;
        } else if (pesoEmKg < 20.0) {
            return 72.0;
        } else {
            return 92.0;
        }
    }
}
