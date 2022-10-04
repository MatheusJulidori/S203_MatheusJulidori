package pizzaria;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class PizzaBuilderTest {

    @Test
    public void deveConstruirUmaPizza() {
        Pizza pizza = new PizzaBuilder()
                .setTamanho(1)
                .addPepperoni(true)
                .addQueijo(true)
                .getPizza();

        assertNotNull(pizza);
        assertEquals(pizza.getTamanho(), Integer.valueOf(1));
        assertEquals(pizza.getPepperoni(), Boolean.TRUE);
        assertEquals(pizza.getQueijo(), Boolean.TRUE);


    }

}
