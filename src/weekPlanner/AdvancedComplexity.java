package weekPlanner;
import java.util.Scanner;

public class AdvancedComplexity {
    static String[][] schedule = new String[][]{
            {"Sunday", "do home work"},
            {"Monday", "go to courses; watch a film"},
            {"Tuesday", "go to jym"},
            {"Wednesday,", "go to courses; hang out with friends"},
            {"Thursday", "go to ice skating"},
            {"Friday", "do home work"},
            {"Saturday", "go to courses; go to jym"}

    };

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please, input the day of the week");
            String text = sc.nextLine().toLowerCase().trim();
            if (text.contains("change")) set(text);
            else get(text);
        }
    }

    public static void set (String text) {
        String day = text.split(" ")[0];
        System.out.println("Enter the day of week: " + day);
        String result = switch (day) {
            case "sunday" -> "Your tasks for " + schedule[0][0] + ": " + schedule[0][1];
            case "monday" -> "Your tasks for " + schedule[1][0] + ": " + schedule[1][1];
            case "tuesday" -> "Your tasks for " + schedule[2][0] + ": " + schedule[2][1];
            case "wednesday" -> "Your tasks for " + schedule[3][0] + ": " + schedule[3][1];
            case "thursday" -> "Your tasks for " + schedule[4][0] + ": " + schedule[4][1];
            case "friday" -> "Your tasks for " + schedule[5][0] + ": " + schedule[5][1];
            case "saturday" -> "Your tasks for " + schedule[6][0] + ": " + schedule[6][1];
            default -> "Sorry, I don't understand you, please try again";
        };
        System.out.println(result);
    }

    public static void get (String text) {
        Scanner sc = new Scanner(System.in);
        String day = text.split(" ")[1];    //change [day of the week]
        String result = switch (day) {
            case "sunday" -> schedule[0][1] = sc.nextLine();
            case "monday" -> schedule[1][1] = sc.nextLine();
            case "tuesday" -> schedule[2][1] = sc.nextLine();
            case "wednesday" -> schedule[3][1] = sc.nextLine();
            case "thursday" -> schedule[4][1] = sc.nextLine();
            case "friday" -> schedule[5][1] = sc.nextLine();
            case "saturday" -> schedule[6][1] = sc.nextLine();
            default -> "Sorry, I don't understand you, please try again";
        };
        System.out.println(result);
    }
}

