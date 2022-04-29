package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.Carro;

public class CarroTest {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Fusca";
        carro.ano = 1965;
        carro.modelo = "Fusca Bala";

        carro2.nome = "Mustang";
        carro2.ano = 1968;
        carro2.modelo = "GT 508";

        carro = carro2;

        System.out.println("Carro 1 \nNome: " + carro.nome + " \nAno: " + carro.ano + " \nModelo: " + carro.modelo);
        System.out.println("\nCarro 1 \nNome: " + carro2.nome + " \nAno: " + carro2.ano + " \nModelo: " + carro2.modelo);
    }
}
