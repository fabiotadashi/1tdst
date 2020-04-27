package banco_fiap;

public class CaixaEletronico {

    private Conta contaLogada;

    public boolean logar(String senhaDigitada){
        if(!contaLogada.getSenha().equals(senhaDigitada)){
            System.out.println("A senha digitada não confere");
            return false;
        }else{
            System.out.println("Olá "+contaLogada.getTitular().getNome()+". Você está logado.");
            return true;
        }
    }

    public void deslogar(){
        System.out.println("Obrigado por utilizar o banco fiap");
        contaLogada = null;
    }

    public float sacar(float valor) {
        if (contaLogada.getSaldo() >= valor) {
            contaLogada.setSaldo(contaLogada.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente: " + contaLogada.getSaldo());
        }
        return contaLogada.getSaldo();
    }

    public float depositar(float valor) {
        contaLogada.setSaldo(contaLogada.getSaldo() + valor);
        return contaLogada.getSaldo();
    }

    public void imprimirExtrato() {
        System.out.println("--------------------------------");
        System.out.println("Nome: " + contaLogada.getTitular().getNome());
        System.out.println("Cpf: " + contaLogada.getTitular().getCpf());
        System.out.println("Saldo atual: " + contaLogada.getSaldo());
        System.out.println("--------------------------------");
    }

    public void setContaLogada(Conta contaLogada) {
        this.contaLogada = contaLogada;
    }

    public boolean estaLogado() {
        return contaLogada != null;
    }
}
