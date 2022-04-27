package academy.devdojo.maratonajava.introducao;

public class ArraysMultidimensionais02 {
    public static void main(String[] args) {
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[3];
        arrayInt[2] = new int[5];

        for (int[] arryBase : arrayInt) {
            System.out.println("\n------");
            for (int num : arryBase) {
                System.out.print(num + " ");
            }
        }

        int[][] arrayInt2 = {{1, 2}, {1, 2, 3}, {1, 2, 3, 4, 5}};
        for (int[] arrayBase : arrayInt2) {
            System.out.println("\n-------------");
            for (int num : arrayBase) {
                System.out.print(num);
            }
        }
    }

}
