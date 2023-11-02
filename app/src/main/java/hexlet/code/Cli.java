package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void greeting() {
        System.out.println("\nWelcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();

        System.out.printf("Hello, %s!\n", userName);
    }
}
