package banco_fiap;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class ExecucaoCaixaEletronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo ao Banco FIAP");

        // Recendo dados do usuário
        System.out.println("Qual o seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Que dia você nasceu?");
        int dia = scanner.nextInt();
        System.out.println("Que mês você nasceu?");
        int mes = scanner.nextInt();
        System.out.println("Que ano você nasceu?");
        int ano = scanner.nextInt();

        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);

        if (Period.between(dataNascimento, LocalDate.now()).getYears() < 18) {
            System.out.println("Aluno menor de idade não pode ter conta");
            return;
        }

        System.out.println("Qual o seu cpf?");
        String cpf = scanner.next();

        System.out.println("Escolha a sua senha?");
        String senha = scanner.next();

        // Criando o Aluno
        Aluno aluno = new Aluno();
        aluno.setNome(nome);
        aluno.setDataNascimento(dataNascimento);
        aluno.setCpf(cpf);

        // Criando a Conta
        Conta conta = new Conta();
        conta.setTitular(aluno);
        conta.setSaldo(0);
        conta.setNumeroConta("12345-5");
        conta.setSenha(senha);

        // Criando o Caixa Eletronico
        CaixaEletronico caixaEletronico = new CaixaEletronico();
        caixaEletronico.setContaLogada(conta);

        // Iniciando as operações no Caixa Eletrônico
        System.out.println("Vamos iniciar as operações:");
        String senhaDigitada;
        do {
            System.out.println("Qual a senha?");
            senhaDigitada = scanner.next();
        } while (!caixaEletronico.logar(senhaDigitada));

        do {
            System.out.println("1 - sacar");
            System.out.println("2 - depositar");
            System.out.println("3 - imprimir extrato");
            System.out.println("4 - sair");

            switch (scanner.nextInt()) {
                case 1:
                    System.out.println("Qual o valor do saque?");
                    float valorSacado = scanner.nextFloat();
                    caixaEletronico.sacar(valorSacado);
                    break;
                case 2:
                    System.out.println("Qual o valor do deposito?");
                    float valorDeposito = scanner.nextFloat();
                    caixaEletronico.depositar(valorDeposito);
                    break;
                case 3:
                    caixaEletronico.imprimirExtrato();
                    break;
                case 4:
                    caixaEletronico.deslogar();
                    break;
                default:
                    System.out.println("Operação inválida");
            }
        } while (caixaEletronico.estaLogado());

    }

}
