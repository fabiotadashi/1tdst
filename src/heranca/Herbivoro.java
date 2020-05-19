package heranca;

import java.io.Serializable;

public class Herbivoro extends Mamifero implements Serializable {

    public void comerMato(){
        System.out.println("comendo mato...");
    }

}
