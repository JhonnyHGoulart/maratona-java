package academy.devdojo.maratonajava.introducao;

/* Prática
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 *
 * Eu <nome>, morando no endereço <endereço>,
 * confirmo que recebi o salario de <salario, na data <data>
 */

public class TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Jhonny Hilário";
        String endereço = "Santa Luzia";
        double salario = 2500.00;
        String dataSalarioRecebido = "18/04/2022";
        String relatorio = "Eu " + nome + ", morando no endereço " + endereço + ", confirmo que recebi o salario " + salario + ", na data de " + dataSalarioRecebido;

        System.out.println(relatorio);
    }
}
