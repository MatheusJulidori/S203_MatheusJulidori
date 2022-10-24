package builder;

public class Carro {
    
    
    private Porta[] portas;
    private Motor motor;
    private ComputadorBordo computadorBordo;
    private FreioABS freioABS;


    public ComputadorBordo getComputadorBordo() {
        return computadorBordo;
    }

    public void setComputadorBordo(ComputadorBordo computadorBordo) {
        this.computadorBordo = computadorBordo;
    }

    public FreioABS getFreioABS() {
        return freioABS;
    }

    public void setFreioABS(FreioABS freioABS) {
        this.freioABS = freioABS;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Porta[] getPortas() {
        return portas;
    }

    public void setPortas(Porta[] portas) {
        this.portas = portas;
    }

    
}
