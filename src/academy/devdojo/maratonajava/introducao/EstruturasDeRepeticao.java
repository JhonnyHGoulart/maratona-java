package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        // while, do whilw, for
        int count = 0;
        while (count <= 10) {
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do do while");
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
