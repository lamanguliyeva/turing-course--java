package lesson7;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class ShipBattleGame {
    public static void main(String[] args) {
        //Random rand = new Random();
        int[][] map = new int[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                //map[i][j] = rand.nextBytes();
                map[i][j] = (i * 10) + j;
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
    }
}
