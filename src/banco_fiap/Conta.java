package banco_fiap;

public class Conta {

    private Aluno titular;
    private float saldo;
    private String numeroConta;
    private String senha;

    public Aluno getTitular() {
        return titular;
    }

    public void setTitular(Aluno titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
}
