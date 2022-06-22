package academy.devdojo.maratonajava.javacore.interfaces.test;

import academy.devdojo.maratonajava.javacore.interfaces.model.DataLoader;
import academy.devdojo.maratonajava.javacore.interfaces.model.DatabaseLoader;
import academy.devdojo.maratonajava.javacore.interfaces.model.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();

        databaseLoader.chekPermission();
        fileLoader.chekPermission();

        DataLoader.retrieveMaxDataSize();
    }
}
