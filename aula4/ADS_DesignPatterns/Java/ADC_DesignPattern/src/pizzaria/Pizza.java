package pizzaria;

public class Pizza {

    private Integer tamanho = 0;
    private Boolean pepperoni = false;
    private Boolean queijo = false;


    public Integer getTamanho() {
        return tamanho;
    }

    public void setTamanho(Integer tamanho) {
        this.tamanho = tamanho;
    }

    public Boolean getPepperoni() {
        return pepperoni;
    }

    public void setPepperoni(Boolean pepperoni) {
        this.pepperoni = pepperoni;
    }

    public Boolean getQueijo() {
        return queijo;
    }

    public void setQueijo(Boolean queijo) {
        this.queijo = queijo;
    }
}
