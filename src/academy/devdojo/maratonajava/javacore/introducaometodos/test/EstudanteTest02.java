package academy.devdojo.maratonajava.javacore.introducaometodos.test;

import academy.devdojo.maratonajava.javacore.introducaometodos.model.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Jhonny";
        estudante01.idade = 27;
        estudante01.sexo = 'M';

        estudante02.nome = "Thiago";
        estudante02.idade = 32;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();
    }
}
