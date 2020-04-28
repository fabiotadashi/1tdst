package elevador_fiap;

public class SistemaElevador {

    public static void main(String[] args) {
        Elevador elevador = new Elevador();
        elevador.inicializa(4, 3);

        elevador.entrar();
        elevador.entrar();
        elevador.entrar();
        elevador.entrar();

        elevador.descer();

        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();
        elevador.subir();

        elevador.sair();
        elevador.sair();
        elevador.sair();
        elevador.sair();

    }

}
