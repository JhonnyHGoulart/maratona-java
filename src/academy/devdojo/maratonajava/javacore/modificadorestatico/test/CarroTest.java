package academy.devdojo.maratonajava.javacore.modificadorestatico.test;

import academy.devdojo.maratonajava.javacore.modificadorestatico.model.Carro;

public class CarroTest {
    public static void main(String[] args) {

        Carro carro = new Carro("BMW", 280);
        Carro carro2 = new Carro("Mercedes", 275);
        Carro carro3 = new Carro("Audi", 290);

        Carro.setVelocidadeLimite(180);

        carro.imptimeCarro();
        carro2.imptimeCarro();
        carro3.imptimeCarro();

    }
}
