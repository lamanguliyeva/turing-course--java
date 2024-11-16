package weekPlanner;
import java.util.Scanner;

public class WeekPlanner {
    public static void main(String[] args) {
        String[][] schedule = new String[7][2];
        schedule[0][0] = "Sunday";
        schedule[0][1] = "do home work";
        schedule[1][0] = "Monday";
        schedule[1][1] = "go to courses; watch a film";
        schedule[2][0] = "Tuesday";
        schedule[2][1] = "go to jym";
        schedule[3][0] = "Wednesday";
        schedule[3][1] = "go to courses; hang out with friends";
        schedule[4][0] = "Thursday";
        schedule[4][1] = "go to ice skating";
        schedule[5][0] = "Friday";
        schedule[5][1] = "do home work";
        schedule[6][0] = "Saturday";
        schedule[6][1] = "go to courses; go to jym";

        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine().trim().toLowerCase();
        System.out.println("Enter the day of week: " + n);
        String result = switch (n) {
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
}
