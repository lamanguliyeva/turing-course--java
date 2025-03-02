package streamAPI;

public class Task1 {

    public static void main(String[] args) {
    int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    int input = 5;
    boolean found = false;

    for (int num : nums) {
        if (num == input) {
            System.out.println(num);
            found = true;
            break;
        }
    }

    if (!found) {
        System.out.println("doesnt exist");
    }
    }
}
