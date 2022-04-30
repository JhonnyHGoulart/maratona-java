package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class Calculadora {

    public void somarDoisNumeros() {
        System.out.println(10 + 10);
    }

    public void subtrairDoisNumeros() {
        System.out.println(21 - 22);
    }

    public void multiplicaDoisNumeros(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public double divideDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero somente dentro de buracos negros");
            return 0;
        }
        return num1 / num2;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Divisão por zero somente dentro de buracos negros");
            return;
        }
        System.out.println(num1 / num2);
    }
}
