package academy.devdojo.maratonajava.introducao;

public class estruturasCondicionais {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida alcólica");
        }
        //!
        if (!isAutorizadoComprarBebida)
            System.out.println("Não é maior de idade");
    }
}
