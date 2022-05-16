package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Jogador;
import academy.devdojo.maratonajava.javacore.associacao.model.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Cafú");
        Jogador jogador2 = new Jogador("Ronaldo");
        Time time = new Time("Seleção Brasileira");
        Jogador[] jogadores = {jogador, jogador2};

        jogador.setTime(time);
        jogador2.setTime(time);

        time.setJodadores(jogadores);

        System.out.println("------Jogador-----");
        jogador.imprimeJogador();
        System.out.println("------Time-----");
        time.imprimeTime();
    }
}
