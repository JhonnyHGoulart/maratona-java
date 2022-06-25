package academy.devdojo.maratonajava.javacore.exeption.runtime.test;

public class RuntimeExceptionTest02 {
    public static void main(String[] args) {

        int result = divisao(1, 0);
        System.out.println(result);
    }

    private static int divisao(int a, int b) {
        if (b == 0) {
            /**
             * Abaixo é lançando uma exceção do tipo Unchecked e passando uma mensagem que será apresentada junto,
             * lembrando que o tratamento de exceções do tipo RuntimeException e suas filhas, são opcionais.
             */
            throw new IllegalArgumentException("Argumento inválido");
        }
        return a / b;
    }
}
