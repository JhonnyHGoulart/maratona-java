package academy.devdojo.maratonajava.javacore.heranca.test;

import academy.devdojo.maratonajava.javacore.heranca.model.Endereco;
import academy.devdojo.maratonajava.javacore.heranca.model.Funcionario;
import academy.devdojo.maratonajava.javacore.heranca.model.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua dos Ferroviários");
        endereco.setCep("88706-100");

        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Joãozinho");
        pessoa.setCpf("13579");
        pessoa.setEndereco(endereco);

        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Maria");
        funcionario.setEndereco(endereco);
        funcionario.setCpf("789456-2");
        funcionario.setSalario(5000);

        System.out.println("##Funcionário##");
        funcionario.imprime();
        System.out.println("##Pessoa##");
        pessoa.imprime();
    }
}
