package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salario > 5000
        double salario = 6000;
        String doar = "doar";
        String naoDoar = "Não doar";
        //(codigo) ? verdadeiro : falso
        String resultado = salario > 5000 ? doar : naoDoar;
        boolean possoDoar = salario > 5000 ? true : false;

        System.out.println(resultado);
        System.out.println(possoDoar);
    }
}
