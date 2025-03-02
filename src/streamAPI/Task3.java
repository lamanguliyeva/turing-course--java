package streamAPI;

import java.util.*;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<String> numbers = new ArrayList<>();

        System.out.println("Enter the phone numbers: ");

        while (true) {
            String input = sc.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }
            numbers.add(input);
        }

        String fixednums = numbers.stream()
                .map(number -> "+994" + number.substring(1))
                .collect(Collectors.joining(", "));

        System.out.println(fixednums);
    }
}
