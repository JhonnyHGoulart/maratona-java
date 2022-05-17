package academy.devdojo.maratonajava.javacore.associacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite seu nome abaixo");
        String nome = entrada.nextLine();
        System.out.println("Digite sua idade abaixo");
        int idade = entrada.nextInt();
        System.out.println("Digite M ou F para seu sexo");
        char sexo = entrada.next().charAt(0);
        System.out.println("----------------");
        System.out.println("Nome: " + nome + "\nIdade: " + idade + "\nSexo: " + sexo);
    }
}
