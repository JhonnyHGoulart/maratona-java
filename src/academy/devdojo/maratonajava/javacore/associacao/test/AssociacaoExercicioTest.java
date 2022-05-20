package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Aluno;
import academy.devdojo.maratonajava.javacore.associacao.model.Local;
import academy.devdojo.maratonajava.javacore.associacao.model.Professor;
import academy.devdojo.maratonajava.javacore.associacao.model.Seminario;

public class AssociacaoExercicioTest {
    public static void main(String[] args) {
        Local local = new Local("Tubarão");
        Aluno aluno = new Aluno("Jhonny", 28);
        Professor professor = new Professor("Leandro", "Javeiro");
        Aluno[] alunosParaSeminario = {aluno};
        Seminario seminário = new Seminario("Seminário de java", alunosParaSeminario, local);

        professor.setSeminarios(new Seminario[]{seminário});

        professor.relatorio();
    }
}
