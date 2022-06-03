package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.model.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoCliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoPagamento;

public class ClenteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhonny", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Jhonny", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.valueOf("PESSOA_FISICA");
        System.out.println(tipoCliente.NOME_RELATORIO);

        TipoCliente tipoCliente2 = TipoCliente.TipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente2);

    }
}
