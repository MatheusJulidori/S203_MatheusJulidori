package strategy.frete;

import static org.junit.Assert.*;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class CalculadoraFreteTest {

	@Test
	public void deveCalcularFreteParaDHL() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteDHL = new ServicoFreteDHL();
		double valorobtido = calculadora.calcular(servicoFreteDHL, 15.0);
		double valoresperado = 100.0;
		assertEquals(valorobtido, valoresperado,0);
	}

	@Test
	public void deveCalcularFreteParaSedex() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteSedex = new ServicoFreteSedex();
		double valorobtido = calculadora.calcular(servicoFreteSedex, 5.0);
		double valoresperado = 50.00;
		assertEquals(valorobtido, valoresperado,0);
	}

	@Test
	public void deveCalcularFreteParaJadLog() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteJadLog = new ServicoFreteJadLog();
		double valorobtido = calculadora.calcular(servicoFreteJadLog, 20.0);
		double valoresperado = 0.00;
		assertEquals(valorobtido, valoresperado,0);
	}
	
	@Test
	public void deveCalcularFreteParaFedEx() {
		CalculadoraFrete calculadora = new CalculadoraFrete();
		Fretavel servicoFreteFedEx = new ServicoFreteFedEx();
		double valorobtido = calculadora.calcular(servicoFreteFedEx, 10.0);
		double valoresperado = 0.00;
		assertEquals(valorobtido, valoresperado,0);
	}
	
}
