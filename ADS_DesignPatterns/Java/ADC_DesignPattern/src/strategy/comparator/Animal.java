package strategy.comparator;

public class Animal{

    private String nome;
    private long id;

    public Animal(String nome, long id) {
        super();
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Animal [nome=" + nome + ", id=" + id + "]";
    }


}
