package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Jhonny";
        funcionario.idade = 28;
        funcionario.salarios = new double[]{1500, 3000, 2000};

        funcionario.imprimeFuncionario();

    }
}
