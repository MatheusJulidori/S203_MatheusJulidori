package strategy.frete;

public class ServicoFreteJadlog implements Fretavel{

    @Override
    public double calcularValor(double pesoEmKg) {
        if(pesoEmKg< 10.0) {
            return 54.0;
        }else if(pesoEmKg< 20.0){
            return 74.0;
        }else{
            return 94.0;
        }
    }

}
