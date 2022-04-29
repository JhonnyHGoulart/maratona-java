package academy.devdojo.maratonajava.introducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
        //idade < 15 categoria infantil
        //idade >= 15 && <18 categoria juvenil
        //idade >= 18 categoria adulto
        int idade = 17;
        String categoria;

        if (idade < 15) {
            categoria = "Infaltil";
        } else if (idade >= 15 && idade < 18) {
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        System.out.println(categoria);
    }
}
