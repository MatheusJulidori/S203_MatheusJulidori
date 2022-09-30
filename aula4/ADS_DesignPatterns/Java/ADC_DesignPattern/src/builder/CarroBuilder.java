package builder;

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

}
