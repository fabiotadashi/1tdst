package ecommerce_covid;

import java.util.List;

public class LojaVirtual {

    private int estoque;

    public boolean venderMascaras(int quantidade){
        if(estoque >= quantidade){
            System.out.println("Vendendo "+quantidade+" máscara(s)");
            estoque = estoque - quantidade;
            return true;
        }else{
            System.out.println("Quantidade insuficiente, encomende mais na fábrica");
            return false;
        }
    }

    public void solicitarMascarasFabrica(Fabrica fabrica){
        List<Mascara> listaMascara = fabrica.gerarMascaras(10);
        estoque = estoque + listaMascara.size();
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }
}
