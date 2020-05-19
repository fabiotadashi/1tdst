package heranca;

import java.io.Serializable;

public class Girafa extends Herbivoro implements Serializable {

    private int tamanhoPescoco;

    public int getTamanhoPescoco() {
        return tamanhoPescoco;
    }

    public void setTamanhoPescoco(int tamanhoPescoco) {
        this.tamanhoPescoco = tamanhoPescoco;
    }

}
