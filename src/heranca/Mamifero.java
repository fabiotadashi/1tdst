package heranca;

import java.io.Serializable;

public class Mamifero extends Animal implements Serializable {

    private int tempoGestacao;
    private String tipoPelagem;

    public void amamentar(){
        System.out.println("Mamífero amamentando");
    }

    public int getTempoGestacao() {
        return tempoGestacao;
    }

    public void setTempoGestacao(int tempoGestacao) {
        this.tempoGestacao = tempoGestacao;
    }

    public String getTipoPelagem() {
        return tipoPelagem;
    }

    public void setTipoPelagem(String tipoPelagem) {
        this.tipoPelagem = tipoPelagem;
    }
}
