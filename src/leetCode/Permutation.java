package leetCode;

public class Permutation {
    public static void main(String[] args) {
        int[] nums1 = {0, 2, 1, 5, 3, 4};
        int [] nums2 = {5, 0, 1, 2, 3, 4};

        printArray(buildArray(nums1));
        printArray(buildArray(nums2));

    }

    public static int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
