/*
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

import static com.sun.beans.introspect.PropertyInfo.Name.bound;

public class Main {
    static int[] staticIntArray = new int[10];
    byte[][] twoDimensionalArray;
    char[][][] threeDimensionalArray;


    public static void main(String[] args) {
//*
/using scanner
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String a = sc.nextLine();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int b = sc1.nextInt();
        System.out.println("Your name is " + a + "\nYour age is " + b);


//*
/if statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        boolean b = true;
        if(a == 0){
            System.out.println("is equal to zero");
        }


        //if-else statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        boolean b = true;
        if(a>0) {
            System.out.println("is positive");
        }
        else {
           System.out.println("is negative or equal to zero");
        }


//*
/ternary = short-hand if-else statement
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        String result = (a>0) ? "Positive" : "Negative or 0";
        System.out.println(result);


        //else-if statement
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
        }


        //switch
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
        System.out.println(result);


        //while loop
Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        while(a<0) {
            System.out.println(a);
            a++;
        }


//*
/do/while loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        do{
            System.out.println(a);
            a--;
        }
        while (a>0);


//*
/for loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        for (int i = 0; i < 10; i += 2) {
            System.out.println(a);
        }


//*
/nested loop
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int a = sc.nextInt();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.println(a);
            }
        }


//*
/for-each loop
        String[] menu = {"Breakfast", "Lunch", "Dinner"};
        for (String i : menu) {
            System.out.println(i);
        }


//*
/break
        for (int i = 0; i < 5; i++) {
            if(i==2) {
                break;
            }
                System.out.println(i);
        }


//*
/continue
        for (int i = 0; i < 5; i++) {
            if(i==2) {
                continue;
            }
            System.out.println(i);
        }


Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        int sum=0;
        for (int i = 0; i < 10; i++) {
           sum+=n[i];
           System.out.println(sum);
        }


Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n != 0){
            sum += n % 10;
            n /= 10;
        }
        System.out.println(sum);



Scanner sc = new Scanner(System.in);
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
        } else System.out.println("Not Prime");



staticIntArray = new int[]{1,2,3,4};
        DeclareAr rayDemo demo = new DeclareArrayDemo();
        demo.twoDimensionalArray = new byte[3][3];
        demo.threeDimensionalArray = new char[3][3][3];
        demo.threeDimensionalArray = new char[]{'a','b','c'};


Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        int min = arr[1];

        for (int i = 1; i < n; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for (int i = 1; i < n; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);


staticIntArray = new int[3];
        Main demo = new Main();
        demo.twoDimensionalArray = new byte[3][3];
        demo.threeDimensionalArray = new char[3][3][];
        demo.threeDimensionalArray[0][0] = new char[]{'A','B','C'};

        staticIntArray[0]=3;
        staticIntArray[1]=-1;
        staticIntArray[2]=4;

        char[][] x = demo.threeDimensionalArray[0];
        int[][] a = new int[3][];
        a[0] = new int[5];
        a[1] = new int[6];
        a[2] = new int[7];
        System.out.println("end");


Scanner sc = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("enter the value: ");
            arr[i] = sc.nextInt();
        }
        System.out.println("the array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i] + " ");
        }
        System.out.println("print array using util: ");
        System.out.println(Arrays.toString(arr));


Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < n - 1 - j; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }





Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        //int c = calculate(a, b);
        // System.out.println(c);
        System.out.println(calculate(10, -5));
        }
    public static int calculate(int a, int b) {
        int x= a + b;
        return x;
        // return a + b;



   int i = new Random().nextInt(bound:10);
        if (i > 100) return;
        System.out.println("nonparametric");
    }
    public static String parametricNonVoidMethod(byte count){

    }
}
*/



