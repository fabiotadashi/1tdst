package java_com_classes;

import java.time.LocalDate;

public class CriacaoPessoas {

    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();
        Pessoa pessoa1 = new Pessoa(22);



        pessoa.setNome("Fábio");
        pessoa.setAltura(1.77F);
        pessoa.setIdade(33);
        pessoa.setDataNascimento(LocalDate.of(2020, 01, 01));

        pessoa.exibirDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setAltura(1.90F);
        pessoa2.setIdade(18);

        pessoa2.exibirDados();
    }

}
