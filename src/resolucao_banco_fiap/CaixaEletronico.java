package resolucao_banco_fiap;

public class CaixaEletronico {

    private Conta contaAtiva;

    public float sacar(float valor) {

        if (valor > contaAtiva.getSaldo()) {
            System.out.println("Saldo insuficiente.");
        } else {
            float saldoRestante = contaAtiva.getSaldo() - valor;
            contaAtiva.setSaldo(saldoRestante);
        }

        return contaAtiva.getSaldo();
    }

    public float depositar(float valor) {

        if (valor > 0) {
            contaAtiva.setSaldo(valor + contaAtiva.getSaldo());
        } else {
            System.out.println("Por favor, deposite um valor positivo.");
        }

        return contaAtiva.getSaldo();
    }

    public void imprimirDadosConta() {
        System.out.println("-----------------------");
        System.out.println("BANCO FIAP");
        System.out.println("Nome: " + contaAtiva.getTitular().getNome());
        System.out.println("Conta: " + contaAtiva.getNumeroConta());
        System.out.println("Saldo: R$" + contaAtiva.getSaldo());
        System.out.println("-----------------------");
    }

    public Conta getContaAtiva() {
        return contaAtiva;
    }

    public void setContaAtiva(Conta contaAtiva) {
        this.contaAtiva = contaAtiva;
    }
}
