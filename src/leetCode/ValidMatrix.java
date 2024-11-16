package leetCode;
import java.util.Scanner;
import java.util.Arrays;
public class ValidMatrix {
    public static void  main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arrays: ");
        int n = sc.nextInt();
        int[] rowSum = new int[n];
        int[] colSum = new int[n];

        System.out.println("Enter the elements of rowSum array: ");
        for (int i = 0; i < n; i++) {
            rowSum[i] = sc.nextInt();
        }

        System.out.println("Enter the elements of colSum array: ");
        for (int i = 0; i < n; i++) {
            colSum[i] = sc.nextInt();
        }

        int[][] matrix = restoreMatrix(rowSum, colSum);
        for (int[] row : matrix) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] restoreMatrix(int[] rowSum, int[] colSum) {
        int m = rowSum.length;
        int n = colSum.length;
        int[][] matrix = new int[m][n];

        for (int i = 0; i  < m; i++) {
            for (int j = 0; j < n; j++) {
                int value = Math.min(rowSum[i], colSum[j]);
                matrix[i][j] = value;
                rowSum[i] -= value;
                colSum[j] -= value;
            }

        }
        return matrix;
    }
}
