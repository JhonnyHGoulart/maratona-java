package academy.devdojo.maratonajava.javacore.exeption.exception.test;

import academy.devdojo.maratonajava.javacore.exeption.model.Leitor1;
import academy.devdojo.maratonajava.javacore.exeption.model.Leitor2;

import java.io.*;

public class TryWithResourcesTest01 {
    public static void main(String[] args) {
        lerArquivo();

    }

    /**
     * TRY com recursos: O Try with resources só poderá ser utilizado com objetos que implementarem Coseable ou AltoCloseable
     */
    public static void lerArquivo() {
        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo2() {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo3() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("teste.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
