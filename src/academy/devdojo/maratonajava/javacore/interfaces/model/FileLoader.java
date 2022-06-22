package academy.devdojo.maratonajava.javacore.interfaces.model;

/**
 * É utilizado para implementar uma classe abstrata a palavras reservada 'implements';
 * Não existe uma quantidade limite de implementações, podemos implementar quantas classes desejarmos.
 */
public class FileLoader implements DataLoader, DataRemover {

    @Override
    public void remove() {
        System.out.println("Removendo dados de um arquivo");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo");
    }
}
