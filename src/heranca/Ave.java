package heranca;

import java.io.Serializable;

public class Ave extends Animal implements Serializable {

    private boolean voador;
    private String tamanhoPena;

    public void voar(){
        if(voador){
            System.out.println("animal voando... ");
        }else{
            System.out.println("Desculpe, esse animal não voa!");
        }
    }

    public void botaOvo(){
        System.out.println("botando ovo");
    }

    public boolean isVoador() {
        return voador;
    }

    public void setVoador(boolean voador) {
        this.voador = voador;
    }

    public String getTamanhoPena() {
        return tamanhoPena;
    }

    public void setTamanhoPena(String tamanhoPena) {
        this.tamanhoPena = tamanhoPena;
    }
}
