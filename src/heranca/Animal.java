package heranca;

import java.io.Serializable;

public class Animal implements Serializable {

    private boolean habitoNoturno;

    public void comer(){
        System.out.println("Animal comendo");
    }

    public boolean isHabitoNoturno() {
        return habitoNoturno;
    }

    public void setHabitoNoturno(boolean habitoNoturno) {
        this.habitoNoturno = habitoNoturno;
    }
}
