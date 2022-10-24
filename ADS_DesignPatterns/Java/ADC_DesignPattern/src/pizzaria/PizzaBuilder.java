package pizzaria;

public class PizzaBuilder {

    private Pizza pizza;

    public PizzaBuilder() {
        this.pizza = new Pizza();
    }

    public PizzaBuilder setTamanho(Integer tamanho){
        pizza.setTamanho(tamanho);
        return this;
    }

    public PizzaBuilder addPepperoni( ){
        pizza.setPepperoni(true);
        return this;
    }

    public PizzaBuilder addQueijo( ){
        pizza.setQueijo(true);
        return this;
    }

    public Pizza getPizza(){
        validarIngredientes();
        validarTamanho();
        return this.pizza;
    }

    public void validarTamanho(){
        if(pizza.getTamanho() != 1 && pizza.getTamanho() != 2 && pizza.getTamanho() != 3){
            throw new IllegalStateException("Tamanho inválido");
        }
    }

    public void validarIngredientes(){
        if(!pizza.getPepperoni() && !pizza.getQueijo()){
            throw new IllegalStateException("A pizza deve ter pelo menos um ingrediente");
        }
    }



}
