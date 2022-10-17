package strategy.frete;

public class ServicoFreteDHL implements Fretavel {
	@Override
	public double calculaValor(double pesoEmKg) {

		if (pesoEmKg < 20.0) {
			return 100.00;
		} else {
			return 90.00;
		}

	}

}
