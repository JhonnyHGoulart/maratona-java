package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Estudante;
import academy.devdojo.maratonajava.javacore.introducaometodos.model.ImpressoraEstudantes;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudantes impressora = new ImpressoraEstudantes();

        estudante01.nome = "Jhonny";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Thiago";
        estudante02.idade = 32;
        estudante02.sexo = 'M';

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}