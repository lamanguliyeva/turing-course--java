package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsDemo {
    public static void main(String[] args) {
        String input = inputString();
        int result = computeSequence(input);
        System.out.println("Result: " + result);

    }

    public static String inputString() {
        String input = "";
        Scanner scanner = null;
        try {
            File file = new File("path\\fileName.txt");
            scanner = new Scanner(file);
            input = scanner.next();
        } catch (FileNotFoundException e) {
            System.out.println("Enter the number: ");
            scanner = new Scanner(System.in);
            input = scanner.next();
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
        return input;
    }

    public static int computeSequence(String input) {
        try {
            if (input.length() < 2) {
                throw new IllegalArgumentException("Enter at least two digits!");
            }

            int sum = 0;
            for (int i = 0; i < input.length() - 1; i++) {
                if (!Character.isDigit(input.charAt(i))) {
                    throw new IllegalArgumentException("Enter only numeric characters!");
                }
                sum += Character.getNumericValue(input.charAt(i));
            }

            int divisor = Character.getNumericValue(input.charAt(input.length() - 1));
            if (divisor == 0) {
                throw new ArithmeticException("Division by zero is not allowed!");
            }

            return sum / divisor;

        } catch (IllegalArgumentException | ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return -1;
        }
    }
}
