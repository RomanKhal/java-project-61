package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String userName = "Stranger";
    public static void setUserName() {
        if (userName.equals("Stranger")) {
            System.out.println("\nWelcome to the Brain Games!");
            System.out.print("May I Have Your Name? ");
            Scanner scanner = new Scanner(System.in);
            userName = scanner.next();
        }
        System.out.printf("Hello, %s!\n", userName);
    }
    public static String getUserName() {
        return userName;
    }
}
