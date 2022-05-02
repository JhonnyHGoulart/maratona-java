package academy.devdojo.maratonajava.javacore.sobrecargademetodos.model;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;

    public void init(String nome, String tipo, int episodeos) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
    }

    public void init(String nome, String tipo, int episodeos, String genero) {
        this.init(nome, tipo, episodeos);
        this.genero = genero;
    }

    public void imprimeAnime() {
        System.out.println(this.nome);
        System.out.println(this.episodeos);
        System.out.println(this.tipo);
        System.out.println(this.genero);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setEpisodeos(int episodeos) {
        this.episodeos = episodeos;
    }

    public int getEpisodeos() {
        return this.episodeos;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
