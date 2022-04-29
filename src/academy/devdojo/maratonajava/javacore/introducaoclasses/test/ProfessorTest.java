package academy.devdojo.maratonajava.javacore.introducaoclasses.test;

import academy.devdojo.maratonajava.javacore.introducaoclasses.model.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Leandro";
        professor.idade = 42;
        professor.sexo = 'M';

        System.out.print("\nProfessor: " + professor.nome + " \nIdade: " + professor.idade + " \nsexo: " + professor.sexo);
    }
}
