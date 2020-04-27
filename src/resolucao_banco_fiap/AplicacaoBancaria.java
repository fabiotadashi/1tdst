package resolucao_banco_fiap;

import java.time.LocalDate;

public class AplicacaoBancaria {

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Alexandre");
        aluno.setCpf("123456789-12");
        LocalDate dataDeNascimento = LocalDate.of(1985,1, 16);
        aluno.setDataDeNascimento(dataDeNascimento);

        Conta conta = new Conta();
        conta.setSaldo(1000);
        conta.setNumeroConta("29873465");
        conta.setSenha("1234");
        conta.setTitular(aluno);

        CaixaEletronico caixa = new CaixaEletronico();
        caixa.setContaAtiva(conta);

        caixa.sacar(1200);

        caixa.sacar(800);

        caixa.depositar(500);

        caixa.imprimirDadosConta();
    }

}
