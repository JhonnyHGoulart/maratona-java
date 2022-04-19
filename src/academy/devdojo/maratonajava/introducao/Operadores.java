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

        double contaCorrente = 200;
        double contaPupanca = 10000;
        float valorPlaystation = 5000;
        boolean isPlaystationCincoCompravel = contaCorrente > valorPlaystation || contaPupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel? " + isPlaystationCincoCompravel);

        // = += -= *= /= %=
        double bonus = 1800;//1800
        bonus += 1000;//2800
        bonus -= 1000;//1800
        bonus *= 2;//3600
        bonus /= 2;//1800
        bonus %= 2;//0
        System.out.println(bonus);

        int contador = 0;
        contador += 1;//contador = contador + 1
        contador++;//contador = contador + 1
        contador--;
        ++contador;
        --contador;
        int contador2 = 0;

        System.out.println(contador);
        System.out.println(contador2++);
        System.out.println(contador2);
    }
}
