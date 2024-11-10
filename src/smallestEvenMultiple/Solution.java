package smallestEvenMultiple;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        if (n%2 == 0) {
            System.out.println(n);;
        }
        else {
            System.out.println(2*n);;
        }
    }
}