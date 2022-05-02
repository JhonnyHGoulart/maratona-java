package academy.devdojo.maratonajava.javacore.construtores.model;

public class Anime {
    private String nome;
    private String tipo;
    private int episodeos;
    private String genero;
    private String estudeo;

    public Anime(String nome, String tipo, int episodeos, String genero) {
        this.nome = nome;
        this.tipo = tipo;
        this.episodeos = episodeos;
        this.genero = genero;
    }
    public Anime(String nome, String tipo, int episodeos, String genero,String estudeo) {
        this(nome,tipo,episodeos,genero);
        this.estudeo = estudeo;
    }
    public Anime(){

    }

    public void imprimeAnime() {
        System.out.println(this.nome);
        System.out.println(this.episodeos);
        System.out.println(this.tipo);
        System.out.println(this.genero);
        System.out.println(this.estudeo);
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
