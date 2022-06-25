package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Computador;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Gabinete;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Produto;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Televisao;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        /**
         * Observe que podemos dar new em uma classe filha, apartir da suprclasse,
         * mas não podemos chamar atrbutos de uma subclasse, apartir de uma superclasse.
         */
        Produto computador = new Computador("Ryzem 9", 7000);
        Produto gabinete = new Gabinete("nzxt", 500, "23/06/2022");
        Produto televisao = new Televisao("Sansung", 3000);

        CalculadoraImposto.calcularImposto(gabinete);
        System.out.println("----------------------");
        CalculadoraImposto.calcularImposto(computador);
    }
}
