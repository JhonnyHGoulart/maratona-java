package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeFuncionario() {
        System.out.println("Funcionário: " + this.nome + " \nIdade: " + this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println("Salario: " + salario);
        }
        calcularMediaSalario();
    }

    public void calcularMediaSalario() {
        if (salarios == null) {
            return;
        }

        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial do funcionário: " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public double getMedia() {
        return media;
    }
}
