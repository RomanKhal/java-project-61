package hexlet.code;

import java.util.Scanner;
public class Cli {
    private static String userName;
    public static void setUserName(){
        System.out.print("May I Have Your Name? ");
        Scanner scanner = new Scanner(System.in);
        userName = scanner.nextLine();
        System.out.printf("Hello, %s!\n", userName);
    }
    public static String getUserName(){
        return userName;
    }
}
