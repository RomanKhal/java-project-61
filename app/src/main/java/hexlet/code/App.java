package hexlet.code;


import java.util.Scanner;

public class App {
    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        chooseMenu();
    }

    public static void chooseMenu() {
        System.out.print("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit
                Your choice:\s""");

        String gameNumber = SCANNER.next();
        if (!gameNumber.equals("0") && !gameNumber.equals("1")) {
            Cli.setUserName();
        }

        switch (gameNumber) {
            case "1":
                Cli.setUserName();
                break;
            case "2":
                Even.evenGame();
                break;
            case "3":
                Calc.calcGame();
                break;
            case "4":
                GCD.gcdGame();
                break;
            case "5":
                Progression.progressionGame();
                break;
            case "6":
                Prime.primeGame();
                break;
            case "0":
                System.out.printf("Bye %s!\n", Cli.getUserName());
                break;
            default:
                System.out.printf("\n%s is not an option.\n\n", gameNumber);
                chooseMenu();
        }
    }

}
