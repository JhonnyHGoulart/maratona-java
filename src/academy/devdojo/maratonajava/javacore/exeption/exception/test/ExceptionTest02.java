package academy.devdojo.maratonajava.javacore.exeption.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    /**
     * Observe que na assinatura do método estamos
     */
    public static void main(String[] args) throws IOException {
        criarNovoArquivo();
    }

    /**
     * Na assinatura do método abaixo é utilizado 'throws IOException',
     * isso se dá quando queremos que a responsabilidade do tratamento fique para quem chama-lo;
     * Observe também que, logo abaixo do e.printStackTrace() é relançado a exceção com 'throw e';
     */
    public static void criarNovoArquivo() throws IOException {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado? " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
