package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static int winsCount = 0;
    public static int gameNumber;
    public static void chooseMenu() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("""
                    Please enter the game number and press Enter.
                    1 - Greet
                    2 - Even
                    3 - Calc
                    4 - GCD
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
                case 3:
                    Calc.calcGame();
                    break;
                case 4:
                    GCD.gcdGame();
                case 0:
                    System.out.printf("Bye %s!\n", Cli.getUserName());
                    break;
                default:
                    System.out.printf("%d is not an option.\n", gameNumber);
            }
        } while (gameNumber != 0);
    }

    static int randomize(int multiplyer) {
        return (int) (Math.random() * multiplyer);
    }
}
