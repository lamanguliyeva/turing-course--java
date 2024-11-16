package lesson7;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
    public static void main(String[] args) {
        Random rand = new Random();
        int rand_int1 = rand.nextInt(10000, 100000);
        System.out.println("Random num: " + rand_int1);
        int[] digits1 = new int[5];
        for (int i = 4; i >= 0; i--) {
            digits1[i] = rand_int1 % 10;
            rand_int1 /= 10;
        }
       /* for (int i = 0; i < digits1.length; i++) {
            System.out.println(digits1[i]);
        }*/

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered num: " + num);
        int[] digits = new int[5];
        for (int i = 4; i >= 0; i--) {
            digits[i] = num % 10;
            num /= 10;
        }
        /*for (int i = 0; i < digits.length; i++) {
        System.out.println(digits[i]);
        }*/

        boolean[] x = new boolean[5];   //x = matched user digit
        boolean[] y = new boolean[5];  //y = matched random digit
        int green = 0;    // count of digits matched on exact location.
        int yellow = 0;  // count of digits which has in number but in different location.

        for (int i = 0; i < 5; i++) {
            if (digits[i] == digits1[i]) {
                green++;
                x[i] = true;
                y[i] = true;
            }
        }

        for (int i = 0; i < 5; i++) {
            if (!x[i]) {
                for (int j = 0; j < 5; j++) {
                    if (!y[j] && digits[i] == digits1[j]) {
                        yellow++;
                        y[j] = true;
                        break;
                    }
                }
            }
        }
        System.out.println(green + " green " + yellow + " yellow.");

        if (green == 5) {
            System.out.println("THE GAME FINISHED");
        }
    }
}
