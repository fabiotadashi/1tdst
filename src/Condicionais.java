import java.util.Scanner;

public class Condicionais {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o nome da pessoa 1?");
        String nomePrimeiraPessoa = scanner.next();

        System.out.println("Qual a altura da pessoa 1?");
        double alturaPrimeiraPessoa = scanner.nextDouble();

        System.out.println("Qual o peso da pessoa 1?");
        float pesoPrimeiraPessoa = scanner.nextFloat();

        System.out.println("Qual o nome da pessoa 2?");
        String nomeSegundaPessoa = scanner.next();

        System.out.println("Qual a altura da pessoa 2?");
        double alturaSegundaPessoa = scanner.nextDouble();

        System.out.println("Qual o peso da pessoa 2?");
        float pesoSegundaPessoa = scanner.nextFloat();

        if(alturaPrimeiraPessoa > alturaSegundaPessoa){
            System.out.println(nomePrimeiraPessoa + " é mais alto(a).");
        } else if(alturaSegundaPessoa > alturaPrimeiraPessoa){
            System.out.println(nomeSegundaPessoa + " é mais alto(a).");
        } else {
            System.out.println("Os dois tem a mesma altura.");
        }

        if(pesoPrimeiraPessoa > pesoSegundaPessoa){
            System.out.println(nomePrimeiraPessoa + " é mais pesado(a)");
        } else if(pesoSegundaPessoa > pesoPrimeiraPessoa){
            System.out.println(nomeSegundaPessoa + " é mais pesado(a)");
        } else {
            System.out.println("Os dois tem o mesmo peso");
        }

    }

}
