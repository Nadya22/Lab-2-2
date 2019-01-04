import java.util.Scanner;

public class Matrix {

    public int a, b;
    public int c, d;

    public void input() {
        Scanner in = new Scanner(System.in);
             System.out.print("Введите количество строк массива матрицы 1: ");
            a = in.nextInt();

            System.out.print("Введите количество столбцов массива матрицы 1: ");
            b = in.nextInt();


            int[][] arr = new int[a][b];

            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print("Введите элемент arr[" + i + "][" + j + "]:");
                    arr[i][j] = in.nextInt();
                }
            }
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + "\t");
                }
                System.out.println();
            }

            System.out.print("Введите количество строк массива матрицы 2: ");
             c = in.nextInt();

            System.out.print("Введите количество столбцов массива матрицы 2: ");
            d= in.nextInt();

            int[][] arr2 = new int[c][d];

             for (int i = 0; i < arr2.length; i++) {
                 for (int j = 0; j < arr2[i].length; j++) {
                     System.out.print("Введите элемент arr2[" + i + "][" + j + "]:");
                arr2[i][j] = in.nextInt();
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }

   // умножение матриц
        int m = arr.length;
        int n = arr2[0].length;
        int o = arr2.length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < o; k++) {
                    res[i][j] += arr[i][k] * arr2[k][j];
                }
            }
        }
        System.out.println("Результат умножения матриц:");
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++) {
                System.out.format(" %6d ", res[i][j]);
            }
            System.out.println();
        }
    }
    }




