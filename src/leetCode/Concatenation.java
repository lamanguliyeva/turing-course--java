package leetCode;
import java.util.Scanner;
import java.util.Arrays;
public class Concatenation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array nums: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        int[] ans = new int[2*n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter each element of array nums: ");
            nums[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
    }
}
