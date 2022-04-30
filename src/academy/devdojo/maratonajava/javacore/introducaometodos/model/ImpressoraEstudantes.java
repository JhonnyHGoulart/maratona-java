package academy.devdojo.maratonajava.javacore.introducaometodos.model;

public class ImpressoraEstudantes {
    Estudante estudante = new Estudante();

    public void imprime(Estudante estudante) {
        System.out.println("-------------");
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}