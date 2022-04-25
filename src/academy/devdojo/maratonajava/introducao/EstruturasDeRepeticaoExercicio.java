package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticaoExercicio {
    public static void main(String[] args) {
        //Imprima todos os números pares de 8 até 1000
        for (int i = 0; i <= 1000; i += 2) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
