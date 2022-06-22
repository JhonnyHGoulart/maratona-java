package academy.devdojo.maratonajava.javacore.interfaces.model;

/**
 * É utilizado para implementar uma classe abstrata a palavras reservada 'implements';
 * Não existe uma quantidade limite de implementações, podemos implementar quantas classes desejarmos.
 */
public class DatabaseLoader implements DataLoader, DataRemover {

    @Override
    public void chekPermission() {
        DataLoader.super.chekPermission();
        System.out.println("Checando permissões no banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados do banco");
    }

    @Override
    public void load() {
        System.out.println("Carregando dados do banco");
    }
}
