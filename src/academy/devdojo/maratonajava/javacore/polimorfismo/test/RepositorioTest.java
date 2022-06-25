package academy.devdojo.maratonajava.javacore.polimorfismo.test;

import academy.devdojo.maratonajava.javacore.polimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioArquivo;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioBancoDados;
import academy.devdojo.maratonajava.javacore.polimorfismo.servico.RepositorioMemoria;

public class RepositorioTest {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDados();
        Repositorio repositorio2 = new RepositorioArquivo();
        Repositorio repositorio3 = new RepositorioMemoria();

        repositorio.salvar();
        repositorio2.salvar();
        repositorio3.salvar();
    }
}
