package sorting;

public class arraySorting {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int t = 6;
        System.out.println(linearSearch(arr, t));
    }

    public static int linearSearch (int[][] arr, int t) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == t) {
                    return i;
                }
            }
        }
        return -1;
    }


}
