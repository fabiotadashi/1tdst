package heranca;

public class TesteAnimais {

    public static void main(String[] args) {

        Girafa girafa = new Girafa();

        // caracteristica da classe Girafa
        girafa.setTamanhoPescoco(3);

        // caracteristica herdada da classe Animal
        girafa.setHabitoNoturno(false);

        // caracteristicas herdadas da classe Mamífero
        girafa.setTempoGestacao(6);
        girafa.setTipoPelagem("curto");

        girafa.comer(); // comportamento da classe Animal
        girafa.comerMato(); // comportamento da classe Herbivoro
        girafa.amamentar(); // comportamento da classe Mamífero


        Avestruz avestruz = new Avestruz();
        avestruz.setHabitoNoturno(false);
        avestruz.setVoador(false);
        avestruz.setTamanhoPena("grande");

        avestruz.comer(); // comportamento da classe Animal
        avestruz.voar(); // comportamento da classe Ave
        avestruz.botaOvo(); // comportamento da classe Ave
        avestruz.enterrarCabecaNoChao(); // comportamento da classe Avestruz

    }

}
