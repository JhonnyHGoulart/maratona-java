package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.model.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pelé");
        Time time = new Time("Seleção Argentina");

        jogador1.setTime(time);
        jogador1.imprimeJogador();
    }
}
