package elevador_fiap;

public class Elevador {

    private int andarAtual = 0;
    private int totalDeAndares;
    private int capacidade;
    private int pessoasABordo = 0;

    public void inicializa(int totalDeAndares, int capacidade) {
        this.totalDeAndares = totalDeAndares;
        this.capacidade = capacidade;
        System.out.println("Total de andares: " + totalDeAndares);
        System.out.println("Capacidade: " + capacidade);
    }

    public void entrar() {
        if (getPessoasABordo() < capacidade) {
            setPessoasABordo(pessoasABordo + 1);
            exibirPessoasABordo();
        } else {
            System.out.println("Capacidade máxima atingida. Por favor pegue o próximo.");
        }
    }

    public void sair() {
        if (getPessoasABordo() > 0) {
            setPessoasABordo(pessoasABordo - 1);
            exibirPessoasABordo();
        } else {
            System.out.println("Não tem ninguém aqui!");
        }
    }

    public void subir() {
        if (getAndarAtual() < totalDeAndares) {
            setAndarAtual(andarAtual + 1);
            exibirInformacaoAndar();
        } else {
            System.out.println("Você já está no andar mais alto");
        }
    }

    public void descer() {
        if (getAndarAtual() > 0) {
            setAndarAtual(andarAtual - 1);
            exibirInformacaoAndar();
        } else {
            System.out.println("Você já está no térreo");
        }
    }

    public void exibirPessoasABordo() {
        System.out.println("Quantidade de pessoas a bordo: " + pessoasABordo);
    }

    public void exibirInformacaoAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasABordo() {
        return pessoasABordo;
    }

    public void setPessoasABordo(int pessoasABordo) {
        this.pessoasABordo = pessoasABordo;
    }
}
