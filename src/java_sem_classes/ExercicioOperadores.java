package java_sem_classes;

import java.util.Random;

public class ExercicioOperadores {

    public static void main(String[] args) {

        Random gerador = new Random();

        int primeiroNumero = gerador.nextInt(20);
        int segundoNumero = gerador.nextInt(20);

        System.out.println("O primeiro número é " + primeiroNumero);
        System.out.println("O segundo número é " + segundoNumero);

        int resultadoSoma = primeiroNumero + segundoNumero;
        String parOuImpar;

        if(resultadoSoma % 2 == 0){
            parOuImpar = "par";
        } else {
            parOuImpar = "impar";
        }

        System.out.println("A soma é " + resultadoSoma +" e é "+ parOuImpar);

        double resultadoSubtracao = primeiroNumero - segundoNumero;
        System.out.println("A subtração é " + resultadoSubtracao);

        double resultadoMultiplicacao = primeiroNumero * segundoNumero;
        System.out.println("A multiplicação é " + resultadoMultiplicacao);

        double resultadoDivisao = primeiroNumero / segundoNumero;
        System.out.println("A divisão é " + resultadoDivisao);
    }

}
