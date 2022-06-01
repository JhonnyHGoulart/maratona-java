package academy.devdojo.maratonajava.javacore.enumeracao.model;

public enum TipoCliente {
    PESSOA_FISICA(1),
    PESSOA_JURIDICA(2);

    public final int VALOR;

    TipoCliente(int valor) {
        this.VALOR = valor;
    }
}
