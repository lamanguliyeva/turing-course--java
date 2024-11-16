package leetCode;
import java.util.List;

public class SnakeInMatrix {
    public static void main(String[] args) {
        int n = 3;
        List<String> commands = List.of("DOWN", "RIGHT", "UP");
        System.out.println(finalPositionOfSnake(n, commands));
    }

    public static int finalPositionOfSnake(int n, List<String> commands) {
        int[][] grid = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                grid[i][j] = (i * n) + j;
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }

        int i = 0, j = 0;
        for (String command : commands) {
            switch (command) {
                case "RIGHT":
                    j++;
                    break;
                case "LEFT":
                    j--;
                    break;
                case "UP":
                    i--;
                    break;
                case "DOWN":
                    i++;
                    break;
            }
        }
        return grid[i][j];
    }
}