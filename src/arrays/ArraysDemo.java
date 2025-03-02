package arrays;

import java.util.Arrays;
import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
