package leetCode;

public class IntegerToRoman {
    public static void main (String[] args) {
        System.out.println(intToRoman(3749));
        System.out.println(intToRoman(58));
        System.out.println(intToRoman(1994));
    }

    public static String intToRoman(int num) {
        int[] values = {1000, 500, 100, 50, 10, 5, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C","XC", "L","XL", "X", "IX", "V", "IV", "I"};
        StringBuilder roman = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        return roman.toString();
    }
}
