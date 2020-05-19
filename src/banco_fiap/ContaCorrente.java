package banco_fiap;

public class ContaCorrente {

    private double saldo;

    public double getSaldo(){
        return this.saldo;
    }

    public void depositar(double valor){
        this.saldo = saldo + valor;
    }

    public void sacar(double valor){
        this.saldo = saldo - valor;
    }

}
