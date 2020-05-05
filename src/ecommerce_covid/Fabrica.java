package ecommerce_covid;

import java.util.ArrayList;
import java.util.List;

public class Fabrica {

    private int qtdMateriaPrima;
    private boolean funcionarioTrabalhando;

    public List<Mascara> gerarMascaras(int quantidade) {

        List<Mascara> listaMascaras = new ArrayList<>();

        // Só criar máscaras se tiver funcionário trabalhando

        // Cada máscara criada deve diminuir a quantidade de materia prima

        for (int i = 0; i < quantidade; i++) {
            Mascara mascara = new Mascara();
            mascara.setTipoTecido("algodão");
            mascara.setTamanhoAdulto(true);

            // printar instruções

            listaMascaras.add(mascara);
        }

        return listaMascaras;
    }

    public int getQtdMateriaPrima() {
        return qtdMateriaPrima;
    }

    public void setQtdMateriaPrima(int qtdMateriaPrima) {
        this.qtdMateriaPrima = qtdMateriaPrima;
    }

    public boolean isFuncionarioTrabalhando() {
        return funcionarioTrabalhando;
    }

    public void setFuncionarioTrabalhando(boolean funcionarioTrabalhando) {
        this.funcionarioTrabalhando = funcionarioTrabalhando;
    }
}
