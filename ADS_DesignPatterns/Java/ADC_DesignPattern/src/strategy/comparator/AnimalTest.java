package strategy.comparator;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;

import static org.junit.Assert.*;

public class AnimalTest {

    @Test
    public void deveListarAnimaisPeloNome() {
        List<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(new Animal("Tartaruga", 1));
        listaDeAnimais.add(new Animal("Coelho", 2));
        listaDeAnimais.add(new Animal("Cachorro", 3));
        listaDeAnimais.add(new Animal("Gato", 4));
        listaDeAnimais.add(new Animal("Girafa", 5));
        listaDeAnimais.add(new Animal("Gato", 6));

        System.out.println("Lista Original:");
        listaDeAnimais.forEach(System.out::println);

        listaDeAnimais.sort(new ComparadorPorNome());
        System.out.println("Pós Ordenação:");
        //listaDeAnimais.forEach( a -> System.out.println(a));

        listaDeAnimais.forEach( System.out::println);

    }

    @Test
    public void deveListarAnimaisPeloId() {
        List<Animal> listaDeAnimais = new ArrayList<>();

        listaDeAnimais.add(new Animal("Tartaruga", 1));
        listaDeAnimais.add(new Animal("Coelho", 2));
        listaDeAnimais.add(new Animal("Cachorro", 3));
        listaDeAnimais.add(new Animal("Gato", 4));
        listaDeAnimais.add(new Animal("Girafa", 5));
        listaDeAnimais.add(new Animal("Gato", 6));

        System.out.println("Lista Original:");
        listaDeAnimais.forEach(System.out::println);

        listaDeAnimais.sort(new ComparadorPorId());
        System.out.println("Pós Ordenação:");
        AtomicLong i = new AtomicLong();
        i.set(1);
        listaDeAnimais.forEach( System.out::println);
        listaDeAnimais.forEach(a -> assertEquals(a.getId(), i.getAndIncrement()));

    }


}
