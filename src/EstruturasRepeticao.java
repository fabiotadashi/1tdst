import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstruturasRepeticao {

    public static void main(String[] args) {

//      FOR -> quando eu precisar de x iterações
        for(int i = 0; i <= 10; i++){
            System.out.println("número "+i);
        }


//      FOR EACH -> quando eu quiser iterar pelos itens de uma Collection
        List<String> listaDePalavras = new ArrayList<>();

        listaDePalavras.add("Fabio");
        listaDePalavras.add("Tadashi");
        listaDePalavras.add("Lucas");

        for(String palavra: listaDePalavras){
            System.out.println("Palavra: "+palavra);
        }

        // WHILE  -> Quando eu tiver uma condição variável (mais flexivel)
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        while (opcao != 3){
            System.out.println("Escolha a opção: ");
            System.out.println("opção 1: Votação");
            System.out.println("opção 2: Cadastro" );
            System.out.println("opção 3: Sair" );
            opcao = scanner.nextInt();
        }

        // DO WHILE  -> É um while que executa pelo menos um vez
        int numero = 100;
        do {
            System.out.println("numero "+numero);
            numero = numero + 1;
        } while (numero < 10);

    }

}
