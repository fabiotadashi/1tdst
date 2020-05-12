package sobrecarga_overload;

public class TesteMovimentacaoCarro {

    public static void main(String[] args) {

        Carro carro = new Carro("Fusca", 1980);

        System.out.println("Ano do carro: "+carro.getAno());

        carro.mover("frente");

        carro.mover(10);

        carro.mover("trás", 1);

    }

}
