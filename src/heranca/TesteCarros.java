package heranca;

public class TesteCarros {

    public static void main(String[] args) {

        Formula1 formula1 = new Formula1();
        formula1.setEquipe("Ferrari");
        formula1.setVelocidadeMaxima(300);

        formula1.acelerar(10);


        CarroPasseio carroPasseio = new CarroPasseio();
        carroPasseio.setArCondicionado(true);
        carroPasseio.setDirecaoHidraulica(true);
        carroPasseio.setFabricante("Toyota");
        carroPasseio.setModelo("Corolla");
        carroPasseio.setMotor(2.0F);
        carroPasseio.setVelocidadeMaxima(190);

        carroPasseio.acelerar(1);
    }

}
