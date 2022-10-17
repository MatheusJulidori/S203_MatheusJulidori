package strategy.frete;

public class ServicoFreteJadLog implements Fretavel {

	@Override
	public double calculaValor(double pesoEmKg) {

		if (pesoEmKg < 30.0) {
			return 0.00;
		} else {
			return 150.00;
		}

	}

}
