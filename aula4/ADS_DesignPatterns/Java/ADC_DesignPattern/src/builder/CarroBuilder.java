package builder;

import java.lang.IllegalStateException;
public class CarroBuilder {
    
    private Carro carro;

    public CarroBuilder() {
        carro = new Carro();
    }

    public void buildPortas(Porta[] portas){
        carro.setPortas(portas);
    }

    public void buildMotor(Motor m){
        carro.setMotor(m);
    }

    public void buildComputadorBordo(ComputadorBordo cb){
        carro.setComputadorBordo(cb);
    }

    public void buildFreioABS(FreioABS f){
        carro.setFreioABS(f);
    }

    public Carro getCarro(){
        return this.carro;
    }

    public void validarPortas(){
        if(carro.getPortas() == null){
            throw new IllegalStateException("Nenhuma porta foi adicionada");
        }
        int numeroPortas = carro.getPortas().length;
        if(numeroPortas != 2 && numeroPortas != 4){
            throw new IllegalStateException("O carro deve ter 2 ou 4 portas");
        }
    }

    public void validarMotor(){
        if(carro.getMotor() == null){
            throw new IllegalStateException("Nenhum motor foi adicionado");
        }
    }

}
