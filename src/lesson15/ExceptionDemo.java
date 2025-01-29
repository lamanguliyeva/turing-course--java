package lesson15;

public class ExceptionDemo {
    public static void main(String[] args) {
        divideAndPrint(6, 3);
        divideAndPrint(6, 0);
        System.out.println("END");
    }

    public static void divideAndPrint (int dividend, int divisor) {
        System.out.println(dividend + " / " + divisor +  " = " + divide(dividend, divisor));
    }

    public static int divide (int dividend, int divisor) {
        try {
            return dividend / divisor;
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
