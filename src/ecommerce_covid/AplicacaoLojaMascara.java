package ecommerce_covid;

public class AplicacaoLojaMascara {

    public static void main(String[] args) {

        Fabrica fabrica = new Fabrica();

        LojaVirtual lojaVirtual = new LojaVirtual();


        lojaVirtual.solicitarMascarasFabrica(fabrica); // que o estoque aumentou em 10

        lojaVirtual.venderMascaras(9);

        lojaVirtual.venderMascaras(2);

    }

}
