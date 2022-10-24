package strategy.comparator;

import java.util.Comparator;

public class ComparadorPorId implements Comparator<Animal> {

    @Override
    public int compare(Animal o1, Animal o2) {
        return (int) (o1.getId() - o2.getId());
    }

}

