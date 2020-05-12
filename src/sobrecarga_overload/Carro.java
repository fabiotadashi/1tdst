package sobrecarga_overload;

public class Carro {

    private String modelo;
    private int ano;

    public Carro(String modelo, int ano) {
        this.modelo = modelo;
        this.ano = ano;
    }

    public Carro(){
        this.ano = 2020;
    }

    public void mover(String direcao){
        System.out.println("Carro movendo para: "+direcao+"!");
    }

    public void mover(int metros){
        System.out.println("Carro andando "+metros+" metros!");
    }

    public void mover(String direcao, int metros){
        mover(direcao);
        mover(metros);
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
