package academy.devdojo.maratonajava.javacore.exeption.runtime.test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class RuntimeExceptionTest05 {
    public static void main(String[] args) {

        /**
         * Podemos fazer o tratamento de multiplas exceções porém, seguindo a regra do polimorfismos,
         * é necessário que a exceção mais genérica fique por ultimo, para que todas as outras sejam checadas.
         */
        try {
            throw new RuntimeException();
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e) {
            System.out.println("Dentro do ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Dentro do IndexOutOfBoundsException");
        } catch (RuntimeException e) {
            System.out.println("Dentro do RuntimeException");
        }

        /**
         * No tratamento das exceções abaixo temos tês exceções do tipo Checked, ou seja, filhas de Exception,
         * mas que não estão na mesma linha de herança, por conta disso podemos tratalas no mesmo cacth;
         */
        try {
            talvezLanceException();
        } catch (SQLException | IOException e) {
            e.printStackTrace();
        }
    }

    private static void talvezLanceException() throws SQLException, FileNotFoundException, IOException {

    }
}
