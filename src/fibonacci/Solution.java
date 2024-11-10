package fibonacci;

import java.util.Scanner;

public class Solution {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Fibonacci of " + n + " is: " + fib(n));
    }
    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int a = 0, b = 1, c=0;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return c;
    }
}
