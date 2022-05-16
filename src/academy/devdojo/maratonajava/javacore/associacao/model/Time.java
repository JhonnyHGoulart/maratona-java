package academy.devdojo.maratonajava.javacore.associacao.model;

public class Time {
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome) {
        this.nome = nome;
    }

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public void imprimeTime() {
        System.out.println(nome);
        if (jogadores == null) {
            return;
        } else {
            for (Jogador jogador : jogadores) {
                System.out.println(jogador.getNome());
            }
        }
    }

    public Jogador[] getJodadores() {
        return jogadores;
    }

    public void setJodadores(Jogador[] jodadores) {
        this.jogadores = jodadores;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
