package academy.devdojo.maratonajava.javacore.polimorfismo.model;

public class Computador extends Produto {
    public static final double IMPORTO_POR_CENTO = 0.21;

    public Computador(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("calculando imposto do computador");
        return this.valor * IMPORTO_POR_CENTO;
    }
}
