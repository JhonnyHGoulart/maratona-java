package academy.devdojo.maratonajava.javacore.classesabstratas.model;

public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void calculaBonus() {
        this.salario += this.salario * 0.05;
    }

    public String toString() {
        return "Desenvolvedor " +
                "\nnome: " + nome +
                "\nsalario: " + salario;
    }
}
