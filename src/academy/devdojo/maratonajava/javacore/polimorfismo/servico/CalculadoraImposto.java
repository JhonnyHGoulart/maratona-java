package academy.devdojo.maratonajava.javacore.polimorfismo.servico;

import academy.devdojo.maratonajava.javacore.polimorfismo.model.Gabinete;
import academy.devdojo.maratonajava.javacore.polimorfismo.model.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatório de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto " + produto.getNome());
        System.out.println("Valor " + produto.getValor());
        System.out.println("Imposto a ser pago " + imposto);
        /**
         * Com o if abaixo, estamos verificando se o Objeto que o produto está instanciando é uma instancia do Objeto Gabinete,
         * para isso utilizamos a palavras reservada 'instanceof'.
         */
        if (produto instanceof Gabinete) {
            Gabinete gabinete = (Gabinete) produto;
            System.out.println("Data de fabricação " + gabinete.getDataFabricacao());
        }
    }
}
