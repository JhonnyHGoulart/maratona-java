package academy.devdojo.maratonajava.javacore.modificadorfinal.model;

/**
 * Qualquer classe com o modificador final não pode ser estendida.
 */
public final class Carro {
    private String nome;
    public static final double VELOCIDADE_LIMITE = 250;
    public final Comprador COMPRADOR = new Comprador();

    /**
     * Qualquer método com o modificador final não pode ser sobrescrito.
     * Criar um método com o modificador fina em uma classe que também é final, é redundante, pois se não pode estender
     * a classe também não pode sobrescrever seus métodos.
     */
    public final void imprime(){
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
