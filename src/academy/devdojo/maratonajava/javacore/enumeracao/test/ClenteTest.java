package academy.devdojo.maratonajava.javacore.enumeracao.test;

import academy.devdojo.maratonajava.javacore.enumeracao.model.Cliente;
import academy.devdojo.maratonajava.javacore.enumeracao.model.TipoCliente;

public class ClenteTest {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jhonny", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Jhonny", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
        System.out.println(cliente2);

    }
}
