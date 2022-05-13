package academy.devdojo.maratonajava.javacore.associacao.model;

public class Jogador {
    private String nome;

    public void imprimeJogador(){
        System.out.println(this.nome);
    }

    public Jogador(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
