package resolucao_contrutores_overload;

public class Funcionario {

    private String nome;
    private long matricula;
    private Profissao profissao;
    private double salario;

    public Funcionario(){

    }

    public Funcionario(long matricula){
        this.matricula = matricula;
    }

    public Funcionario(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public Funcionario(long matricula, String nome, Profissao profissao){
        this.matricula = matricula;
        this.nome = nome;
        this.profissao = profissao;
    }

    public void exibirDadosFuncionario(){
        System.out.println("Nome: ".concat(this.getNome())
                .concat("\nMatricula: ").concat(String.valueOf(this.getMatricula()))
                .concat("\nProfissao: ").concat(this.getProfissao().getNome())
                .concat("\nSalário: ").concat(String.valueOf(this.getSalario()))
        );
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public void setMatricula(long matricula) {
        this.matricula = matricula;
    }

    public Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(Profissao profissao) {
        this.profissao = profissao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
