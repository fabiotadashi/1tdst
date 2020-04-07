import java.util.Scanner;

public class CondicionalEleitor {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual o seu nome");
        String nomeEleitor = scanner.next();

        System.out.println("Qual a sua idade?");
        int idadeEleitor = scanner.nextInt();

        if(idadeEleitor < 16){
            System.out.println("Não eleitor");
        } else if (idadeEleitor >= 18 && idadeEleitor <= 65){
            System.out.println("Eleitor obrigatório");
        } else if(idadeEleitor == 16 || idadeEleitor == 17 || idadeEleitor > 65){
            System.out.println("Eleitor facultativo");
        }
    }

}
