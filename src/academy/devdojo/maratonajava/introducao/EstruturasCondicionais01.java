package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcólica");
        }
        //!
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não é maior de idade");
        }

        if (isAutorizadoComprarBebida) {
            System.out.println("Altorizado a comprar bebida alcólica do if else");
        } else {
            System.out.println("Não é meior de idade do if else");
        }
    }
}
