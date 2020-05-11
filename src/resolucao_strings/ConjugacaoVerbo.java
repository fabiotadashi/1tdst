package resolucao_strings;

import com.sun.codemodel.internal.JOp;

import javax.swing.*;
import java.util.Scanner;

public class ConjugacaoVerbo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra terminada em \"ar\"");

        String palavra = "";

        while (!palavra.endsWith("ar")) {
            palavra = scanner.next();

            if (palavra.endsWith("ar")) {
                String palavraConjugada = palavra.substring(0, palavra.length() - 2).concat("ou");
                System.out.println(palavraConjugada);
            } else {
                System.out.println("Palavra inválida. Por favor, digite uma palavra terminada em \"ar\"");
            }
        }

    }
}
