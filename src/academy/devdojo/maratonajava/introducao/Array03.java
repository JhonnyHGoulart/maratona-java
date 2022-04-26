package academy.devdojo.maratonajava.introducao;

public class Array03 {
    public static void main(String[] args) {
        String[] nomes = new String[3];
        nomes[0] = "Jhonny";
        nomes[1] = "Hilario";
        nomes[2] = "Goulart";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
