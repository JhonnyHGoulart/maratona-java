package academy.devdojo.maratonajava.javacore.classesabstratas.model;

public abstract class Funcionario extends Pessoa {
    protected String nome;
    protected double salario;

    @Override
    public void imprime() {
        System.out.println("Imprimindo...");
    }

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
        calculaBonus();
        imprime();
    }

    public abstract void calculaBonus();
}
