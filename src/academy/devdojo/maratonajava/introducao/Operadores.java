package academy.devdojo.maratonajava.introducao;

// + - / *
public class Operadores {
    public static void main(String[] args) {
        int numero1 = 10;
        double numero2 = 20;
        double resultadoMultiplicacao = numero1 + numero2;
        double resultadodivisao = numero2 / numero1;

        System.out.println(numero1 + numero2);
        System.out.println("Valor " + numero1 + numero2);
        System.out.println(numero1 + numero2 + " Valor " + numero1 + numero2);
        System.out.println(resultadoMultiplicacao);
        System.out.println(resultadodivisao);
        System.out.println(numero1 * numero2);

        // %
        int resto = 21 % 2;
        System.out.println("Resto " + resto);

        // < > <= >= == !=
        boolean isDezmaioQueVinte = 10 > 20;
        System.out.println(isDezmaioQueVinte);

        // &&=(AND) ||=(OR) !(NEGAÇÃO)
        int idade = 35;
        float salario = 3500f;
        boolean isDentroDaLei = idade > 30 && salario >= 4612;
        System.out.println("isDentroDaLei? " + isDentroDaLei);
    }
}
