package academy.devdojo.maratonajava.sobrecargademetodos.test;

import academy.devdojo.maratonajava.sobrecargademetodos.model.Anime;

public class AnimeTest {
    public static void main(String[] args) {
        Anime anime = new Anime();

        anime.init("Akudama Drive", "TV", 12, "Ação");

        anime.imprimeAnime();
    }
}
