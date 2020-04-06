import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe um numero");
        int numeroInformado = scanner.nextInt();

        System.out.println("Qual a operação? (+,-,*,/)");
        String operacao = scanner.next();

        System.out.println("Informe outro número");
        int outroNumeroInformado = scanner.nextInt();

        int resultado = 0;

        if (operacao.equals("+")) {
            System.out.println("SOMA");
        }
        if (operacao.equals("-")) {
            resultado = numeroInformado - outroNumeroInformado;
        }
        if (operacao.equals("*")) {
            resultado = numeroInformado * outroNumeroInformado;
        }
        if (operacao.equals("/")) {
            if (outroNumeroInformado == 0) {
                System.out.println("Operação não permitida");
            } else {
                resultado = numeroInformado / outroNumeroInformado;
            }
        }

        System.out.println("O resultado é " + resultado);

    }

}
