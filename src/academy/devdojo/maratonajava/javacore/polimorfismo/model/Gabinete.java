package academy.devdojo.maratonajava.javacore.polimorfismo.model;

public class Gabinete extends Produto {
    public static final double IMPORTO_POR_CENTO = 0.06;
    private String dataFabricacao;

    public Gabinete(String nome, double valor, String dataFabricacao) {
        super(nome, valor);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculado imposto do gabinete");
        return this.valor * IMPORTO_POR_CENTO;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }
}
