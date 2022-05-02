package academy.devdojo.maratonajava.javacore.construtores.test;

import academy.devdojo.maratonajava.javacore.construtores.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime("Akudama Drive", "TV", 12, "Ação");
        Anime anime2 = new Anime();

        anime.imprimeAnime();
        anime2.imprimeAnime();
    }
}
