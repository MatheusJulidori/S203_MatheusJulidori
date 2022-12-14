package strategy.frete.preRefactor;

import org.junit.Test;
import strategy.frete.ServicoFreteDHL;
import strategy.frete.ServicoFreteJadlog;
import strategy.frete.ServicoFreteSedex;

import static org.junit.Assert.*;

public class CalculadoraFreteTest {

    @Test
    public void testCalculaValor() {
        CalculadoraFrete calculadoraFrete = new CalculadoraFrete();
        assertEquals(54.0, calculadoraFrete.calculaValor(new ServicoFreteJadlog(), 5.0), 0.0);
        assertEquals(74.0, calculadoraFrete.calculaValor(new ServicoFreteJadlog(), 15.0), 0.0);
        assertEquals(94.0, calculadoraFrete.calculaValor(new ServicoFreteJadlog(), 25.0), 0.0);
        assertEquals(52.0, calculadoraFrete.calculaValor(new ServicoFreteDHL(), 5.0), 0.0);
        assertEquals(72.0, calculadoraFrete.calculaValor(new ServicoFreteDHL(), 15.0), 0.0);
        assertEquals(92.0, calculadoraFrete.calculaValor(new ServicoFreteDHL(), 25.0), 0.0);
        assertEquals(50.0, calculadoraFrete.calculaValor(new ServicoFreteSedex(), 5.0), 0.0);
        assertEquals(70.0, calculadoraFrete.calculaValor(new ServicoFreteSedex(), 15.0), 0.0);
        assertEquals(90.0, calculadoraFrete.calculaValor(new ServicoFreteSedex(), 25.0), 0.0);
    }
}
