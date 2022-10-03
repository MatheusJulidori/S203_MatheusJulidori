package APIFluente;

import org.junit.Test;

import static org.junit.Assert.*;

public class CarroBuilderFluenteTest {

    @Test
    public void deveConstruirUmCarro() {


        //Criando as partes do carro
        Motor motor = new Motor();
        Porta porta = new Porta();
        Porta porta2 = new Porta();
        Porta[] portas = {porta, porta2};
        ComputadorBordo computadorBordo = new ComputadorBordo();
        FreioABS freioABS = new FreioABS();

        //Adicionando os componentes ao carro
        Carro carro = new CarroBuilderFluente()
                .buildComputadorBordo(computadorBordo)
                .buildMotor(motor)
                .buildPortas(portas)
                .buildFreioABS(freioABS)
                .getCarro();

        //Testando o carro
        assertNotNull(carro);
        assertNotNull(carro.getMotor());
        assertNotNull(carro.getPortas());
        assertNotNull(carro.getComputadorBordo());
        assertNotNull(carro.getFreioABS());
        assertEquals(carro.getMotor(),motor);
        assertArrayEquals(carro.getPortas(),portas);
        assertEquals(carro.getComputadorBordo(),computadorBordo);
        assertEquals(carro.getFreioABS(),freioABS);
        assertEquals(carro.getPortas().length,2);

    }
}

