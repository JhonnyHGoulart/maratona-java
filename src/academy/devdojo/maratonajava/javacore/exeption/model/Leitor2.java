package academy.devdojo.maratonajava.javacore.exeption.model;

import java.io.Closeable;
import java.io.IOException;

public class Leitor2 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("Fichando Leitor2");
    }
}
