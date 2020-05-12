package resolucao_contrutores_overload;

public class TesteFuncionario {

    public static void main(String[] args) {

        Profissao profissao = new Profissao();
        profissao.setNome("Programador");

        Funcionario funcionario = new Funcionario();
        funcionario.setMatricula(1);
        funcionario.setNome("Jose");
        funcionario.setProfissao(profissao);
        funcionario.setSalario(10000);

        funcionario.exibirDadosFuncionario();

        Funcionario funcionario1 = new Funcionario(2, "Maria", profissao);
        funcionario1.setSalario(11000);

        funcionario1.exibirDadosFuncionario();


    }


}
