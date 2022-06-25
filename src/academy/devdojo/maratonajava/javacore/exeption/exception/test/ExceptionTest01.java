package academy.devdojo.maratonajava.javacore.exeption.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest01 {
    public static void main(String[] args) {
        criarNovoArquivo();

        /**
         * Checked: São filhas da classe Exception diretamente, e se não forem tratadas irão lançar um erro em tempo de compilação,
         * ou seja, você não irá conseguir nem compilar o seu código.
         *
         * Unchecked: São filhas de RuntimeExcepiton incluindo RuntimeExcepiton, essas são exeções que são quase sempre culpa do desenvolvedor,
         * como por exemplor, tentar fazer um cast de um objeto não permitido ou tentar acessar um objeto que não existe;
         * RuntimeException não necessita de validação para a compilação do código.
         */
    }

    /**
     * No método abaixo estamos criando uma arquivo que por sua vez exige um tratamento de exeções, ou seja, Checked.
     * O bloco 'try' significa tentar, nesse exemplo ele ira tentar criar um arquivo,
     * caso de algum problema na criação do arquivo o bloco 'catch' que sognifica pegar, irá pegar a exeção,
     * mas para isso precisamos informar o java qual tipo de exeção queremos pegar, que nesse caso é 'IOException',
     * e em seguida passamos  e.printStackTrace() para mostrar a exception.
     */
    private static void criarNovoArquivo() {
        File file = new File("arquivo/teste.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
