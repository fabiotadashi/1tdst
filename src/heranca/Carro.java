package heranca;

import java.io.Serializable;

public class Carro implements Serializable {

    private String modelo;
    private String fabricante;
    private float motor;
    private int velocidadeMaxima;

    public void acelerar(int intensidade) {
        System.out.println("Carro acerando com " + intensidade + " de intensidade");
    }

    public void brecar(int intensidade) {
        System.out.println("Carro brecando com " + intensidade + " de intensidade");
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public float getMotor() {
        return motor;
    }

    public void setMotor(float motor) {
        this.motor = motor;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }
}
