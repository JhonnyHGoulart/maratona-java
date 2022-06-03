package academy.devdojo.maratonajava.javacore.enumeracao.model;

public enum TipoCliente {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Jurídica");

    public final int VALOR;
    public final String NOME_RELATORIO;

    TipoCliente(int valor, String nomeRelatorio) {
        this.VALOR = valor;
        this.NOME_RELATORIO = nomeRelatorio;
    }

    public static TipoCliente TipoClientePorNomeRelatorio(String nomeRelatorio) {
        for (TipoCliente tipoCliente : values()) {
            if (tipoCliente.NOME_RELATORIO.equals(nomeRelatorio)) {
                return tipoCliente;
            }
        }
        return null;
    }
}
