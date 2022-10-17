package strategy.frete;

public class ServicoFreteFedEx implements Fretavel{

	@Override
	public double calculaValor(double pesoEmKg) {
		if (pesoEmKg<20) {
			return 0.0;
		}
		else if (pesoEmKg<=39.9) {
			return 45.00;
		}
		else {
			return 75.00;
		}
	}

}
