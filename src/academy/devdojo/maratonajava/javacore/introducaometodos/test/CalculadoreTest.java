package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Calculadora;

public class CalculadoreTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.somarDoisNumeros();
        calculadora.subtrairDoisNumeros();
        calculadora.multiplicaDoisNumeros(2,5);

    }
}
