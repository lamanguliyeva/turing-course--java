package lesson3;
import java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {

        //using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int b = sc1.nextInt();
        System.out.println("Your name is " + a + "\nYour age is " + b);


        /*//if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        boolean b = true;
        if (a == 0) {
            System.out.println("is equal to zero");
        }*/


        /*//if-else statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        boolean b = true;
        if(a>0) {
            System.out.println("is positive");
        }
        else {
           System.out.println("is negative or equal to zero");
        }*/


        /*//ternary = short-hand if-else statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        String result = (a>0) ? "Positive" : "Negative or 0";
        System.out.println(result);*/



        /*//else-if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        boolean b = true;
        if(a>0) {
            System.out.println("is positive");
        }
        else if(a==0) {
            System.out.println("is equal to zero");
        }
        else {
            System.out.println("is negative");
        }*/


        /*//switch
        Scanner sc = new Scanner(System.in);
        System.out.println("select the order number from menu: ");
        int menu = sc.nextInt();
        switch(menu) {
            case 1:
                System.out.println("Breakfast");
                break;
            case 2:
                System.out.println("Lunch");
                break;
            case 3:
                System.out.println("Dinner");
                break;
            default:
                System.out.println("Drinks");
        }
        int num = 2;
        String result = switch (num) {
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "other";
        };
        System.out.println(result);*/


        /*//while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        while(a<0) {
            System.out.println(a);
            a++;
        }*/



        /*//do/while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        do{
            System.out.println(a);
            a--;
        }
        while (a>0);*/




          /*  //for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        for (int i = 0; i < 10; i += 2) {
            System.out.println(a);
        }*/


        /*//nested loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println(a);
            }
        }*/


        /* //for-each loop
        String[] menu = {"Breakfast", "Lunch", "Dinner"};
        for (String i : menu) {
            System.out.println(i);
        }*/



       /* //break
        for (int i = 0; i < 5; i++) {
            if(i==2) {
                break;
            }
                System.out.println(i);
        }*/


        /*//continue
        for (int i = 0; i < 5; i++) {
            if(i==2) {
                continue;
            }
            System.out.println(i);
        }*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 0; i < 10; i++) {
           sum+=n[i];
           System.out.println(sum);
        }*/


        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);*/



        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime");
        } else System.out.println("Not Prime");*/

    }
}
