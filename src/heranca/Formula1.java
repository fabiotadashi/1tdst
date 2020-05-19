package heranca;

import java.io.Serializable;

public class Formula1 extends Carro implements Serializable {

    private String equipe;

    public Formula1(){

    }

    public Formula1(String equipe){
        this.equipe = equipe;
    }

    public String getEquipe() {
        return equipe;
    }

    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
}
