package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Jhonny");
        funcionario.setIdade(28);
        funcionario.setSalarios(new double[]{1500, 3000, 2000});

        funcionario.imprimeFuncionario();

    }
}
