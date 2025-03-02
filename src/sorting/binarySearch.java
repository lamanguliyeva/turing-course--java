package sorting;

import java.util.Arrays;

public class binarySearch {

    public static void main(String[] args) {
        int[] arr = {10, 15, 13, 27, 24};
        int x = 27;
        System.out.println(binarySearh(arr, x));
    }

    public static int binarySearh (int[] arr, int x) {
        Arrays.sort(arr);
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] < x) {
                low = mid + 1;
            } else {
                low = mid - 1;
            }
        }
        return -1;
    }
}
