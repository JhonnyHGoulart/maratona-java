package academy.devdojo.maratonajava.javacore.exeption.runtime.test;

public class RuntimeExceptionTest03 {
    public static void main(String[] args) {

        abreConexao();
    }

    private static void abreConexao() {
        try {
            System.out.println("Criando o Arquivo");
            throw new RuntimeException();
//            System.out.println("Escrevendo dados no arquivo");

        } catch (RuntimeException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Liberando recursos do SO");
        }

    }
}
