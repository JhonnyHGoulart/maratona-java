package academy.devdojo.maratonajava.javacore.blocosdeinicializacao.model;

public class Anime {
    private String nome;
    private int[] episodeos;

    {
        episodeos = new int[100];
        for (int i = 0; i < episodeos.length; i++) {
            episodeos[i] = i + 1;
            System.out.print(episodeos[i] + " ");
        }
    }

    public Anime(String nome) {
        this.nome = nome;
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

    public void setEpisodeos(int[] episodeos) {
        this.episodeos = episodeos;
    }
}
