package pizzaria;

import org.junit.Test;

import static org.junit.Assert.*;

public class PizzaBuilderTest {

    @Test
    public void deveConstruirUmaPizzaValida() {
        Pizza pizza = new PizzaBuilder()
                .setTamanho(1)
                .addPepperoni()
                .addQueijo()
                .getPizza();

        assertNotNull(pizza);
        assertNotNull(pizza.getTamanho());
        assertEquals(pizza.getPepperoni(), Boolean.TRUE);
        assertEquals(pizza.getQueijo(), Boolean.TRUE);


    }

    @Test
    public void deveInvalidarUmaPizzaComTamanhoErrado() {
        try{
            Pizza pizza = new PizzaBuilder()
                    .setTamanho(4)
                    .addPepperoni()
                    .addQueijo()
                    .getPizza();

            fail("Deveria ter lançado exceção");
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }

    @Test
    public void deveInvalidarPizzaSemIngredientes() {
        try{
            Pizza pizza = new PizzaBuilder()
                    .setTamanho(1)
                    .getPizza();

            fail("Deveria ter lançado exceção");
        }catch (IllegalStateException e){
            e.printStackTrace();
        }
    }
}
