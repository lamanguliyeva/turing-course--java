package leetCode;
import java.util.Scanner;
public class SneakyNumbers {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array nums: ");
        int n = sc.nextInt();
        int[] nums = new int[n + 2];

        for (int i = 0; i < n + 2; i++) {
            System.out.println("Enter the each element of array nums: ");
            nums[i] = sc.nextInt();
        }

        int[] sneakyNumbers = SneakyNumbers(nums);
        System.out.println(sneakyNumbers[0] + sneakyNumbers[1]);
    }

        public static int[] SneakyNumbers (int[] nums) {
            int[] sneakyNumbers = new int[2];
            int[] count =new int[nums.length];
            int index = 0;
            for (int i = 0; i < nums.length; i++) {
                count[nums[i]]++;
                if (count[nums[i]] == 2) {
                    sneakyNumbers[index] = nums[i];
                    index++;
                }
                if (index == 2) {
                    break;
                }
            }
            return sneakyNumbers;
    }
}

