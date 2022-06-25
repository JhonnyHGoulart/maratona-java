package academy.devdojo.maratonajava.javacore.exeption.runtime.test;

public class RuntimeExceptionTest01 {
    public static void main(String[] args) {
        /**
         * Checked: São filhas da classe Exception diretamente, e se não forem tratadas irão lançar um erro em tempo de compilação,
         * ou seja, você não irá conseguir nem compilar o seu código.
         *
         * Unchecked: São filhas de RuntimeExcepiton incluindo RuntimeExcepiton, essas são exeções que são quase sempre culpa do desenvolvedor,
         * como por exemplor, tentar fazer um cast de um objeto não permitido ou tentar acessar um objeto que não existe;
         * RuntimeException não necessita de validação para a compilação do código.
         */

        Object object = null;
        System.out.println(object.toString());

        int[] nums = {1, 2};
        System.out.println(nums[2]);
    }
}
