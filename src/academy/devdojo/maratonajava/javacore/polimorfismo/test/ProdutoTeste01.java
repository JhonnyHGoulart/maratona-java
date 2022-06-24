package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Gabinete;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTeste01 {
    public static void main(String[] args) {
        Computador computador = new Computador("NUC0i7", 11000);
        Gabinete gabinete = new Gabinete("nzxt", 500, "23/06/2022");
        Televisao televisao = new Televisao("Sansung", 3000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-----------------------");
        CalculadoraImposto.calcularImposto(gabinete);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(televisao);

    }
}
