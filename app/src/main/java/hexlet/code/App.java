package hexlet.code;

import java.util.Scanner;

public class App {
    public static int winsCount = 0;
    public static int gameNumber;
    public static void main(String[] args) {
        chooseMenu();
    }

    public static void chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    0 - Exit
                    Your choice:\s""");
            try {
                gameNumber = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Choose a number please.");
                chooseMenu();
            }
            switch (gameNumber) {
                case 1:
                    Cli.setUserName();
                    break;
                case 2:
                    Even.evenGame();
                    break;
                case 0:
                    break;
                default:
                    System.out.printf("%d is not an option.\n", gameNumber);
            }
        } while (gameNumber != 0);
    }
}
