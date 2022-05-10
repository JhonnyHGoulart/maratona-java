package academy.devdojo.maratonajava.javacore.modificadorestatico.model;

public class Anime {
    private String nome;
    private static int[] episodeos;

    static {
        System.out.println("Dentro do bloco de inicialização");
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
            System.out.print(episodeos[i] + " ");
        }
    }

    public Anime() {

    }

    public Anime(String nome) {
        for (int episodeos : Anime.episodeos) {
            System.out.println(episodeos + " ");
            this.nome = nome;
        }
    }

    public void imprieNome() {
        System.out.println(this.nome);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int[] getEpisodeos() {
        return episodeos;
    }
}
