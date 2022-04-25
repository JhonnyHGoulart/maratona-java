package academy.devdojo.maratonajava.introducao;

public class EstruturasDeRepeticaoComBreak {
    public static void main(String[] args) {
        // Imprima os primeiros 25 números de um determinado valor
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }
            System.out.println(i);
        }
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        //Condição valorParcela >=1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela R$:" + valorParcela);
        }
    }
}
