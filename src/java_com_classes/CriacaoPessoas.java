package java_com_classes;

import java.time.LocalDate;

public class CriacaoPessoas {

    public static void main(String[] args) {

        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Fábio");
        pessoa1.setAltura(1.77F);
        pessoa1.setIdade(33);
        pessoa1.setDataNascimento(LocalDate.of(2020, 01, 01));

        pessoa1.exibirDados();

        Pessoa pessoa2 = new Pessoa();
        pessoa2.setNome("João");
        pessoa2.setAltura(1.90F);
        pessoa2.setIdade(18);

        pessoa2.exibirDados();
    }

}
