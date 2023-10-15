package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String userName;
    public static void getUsername(){
        System.out.print("May I Have Your Name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.printf("Hello, %s!", userName);
    }
}
