package leetCode;
import java.util.Scanner;

public class SmallestEvenMultiple {
    public static void main(String[] args) {
        System.out.print("Enter an integer: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n%2 == 0) {
            System.out.println(n);
        }
        else {
            System.out.println(2*n);
        }
    }
}
