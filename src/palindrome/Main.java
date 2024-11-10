package palindrome;
import java.util.Scanner;

public class Main {
    public static boolean isPalindrome(int x) {
        int a = x;
        int b = 0;
        while (x > 0) {
            b = b* 10 + x % 10;
            x /= 10;
        }
        return a == b;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int a = sc.nextInt();
        Main solution = new Main();
        System.out.println(solution.isPalindrome(a));
    }
}
