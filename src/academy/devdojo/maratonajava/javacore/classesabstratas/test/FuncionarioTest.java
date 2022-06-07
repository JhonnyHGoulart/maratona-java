package academy.devdojo.maratonajava.javacore.classesabstratas.test;

import academy.devdojo.maratonajava.javacore.classesabstratas.model.Desenvolvedor;
import academy.devdojo.maratonajava.javacore.classesabstratas.model.Funcionario;
import academy.devdojo.maratonajava.javacore.classesabstratas.model.Gerente;

public class FuncionarioTest {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Kamilla", 15000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Jhonny", 5000);

        System.out.println(gerente);
        System.out.println("-----");
        System.out.println(desenvolvedor);
    }
}
