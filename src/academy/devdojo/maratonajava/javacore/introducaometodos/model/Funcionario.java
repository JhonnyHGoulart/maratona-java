package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprimeFuncionario() {
        System.out.println("Funcionário: " + this.nome + " \nIdade: " + this.idade);

        if (salarios == null) {
            return;
        }
        for (double salario : this.salarios) {
            System.out.println(salario);
        }
        imprimeFuncionario();
    }

    public void calcularMediaSalario() {
        if (salarios == null) {
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("Média salarial do funcionário: " + media);
    }
}
