package lesson4;
import java.util.Scanner;

public class Arrays {
    static int[] staticIntArray = new int[10];
    byte[][] twoDimensionalArray;
    char[][][] threeDimensionalArray;

    public static void main (String[] args) {
        Arrays demo = new Arrays();
        staticIntArray = new int[]{1, 2, 3, 4};
        demo.twoDimensionalArray = new byte[3][3];
        demo.threeDimensionalArray = new char[3][3][3];
        demo.threeDimensionalArray[0][0] = new char[]{'a', 'b', 'c'};

        //example 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[1];

        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


        /*//example 2
        staticIntArray = new int[3];
        Arrays demo = new Arrays();
        demo.twoDimensionalArray = new byte[3][3];
        demo.threeDimensionalArray = new char[3][3][];
        demo.threeDimensionalArray[0][0] = new char[]{'A', 'B', 'C'};

        staticIntArray[0] = 3;
        staticIntArray[1] = -1;
        staticIntArray[2] = 4;

        char[][] x = demo.threeDimensionalArray[0];
        int[][] a = new int[3][];
        a[0] = new int[5];
        a[1] = new int[6];
        a[2] = new int[7];
        System.out.println("end");*/


        /*//example 3
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i] + " ");
        }
        System.out.println("print array using util: ");
        System.out.println(Arrays.toString(arr));*/


        //example 4
        /*Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }*/


    }
}
