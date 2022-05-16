package academy.devdojo.maratonajava.javacore.associacao.test;

import academy.devdojo.maratonajava.javacore.associacao.model.Escola;
import academy.devdojo.maratonajava.javacore.associacao.model.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Leandro");
        Professor professor2 = new Professor("Pietro");
        Professor[] professores = {professor, professor2};

        Escola escola = new Escola("SENAI", professores);

        escola.imprimeEscola();

    }
}
