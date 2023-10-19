package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static int winsCount = 0;
    public static final int WINS = 3;
    private static String gameNumber;

    public static void chooseMenu() {
//        do {
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
        try {
            gameNumber = scanner.next();
            if (!gameNumber.equals("0") && !gameNumber.equals("1")) {
                Cli.setUserName();
            }
        } catch (Exception e) {
            System.out.println("Choose a number please.");
            chooseMenu();
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
                System.out.printf("%s is not an option.\n", gameNumber);
        }
//        } while (gameNumber != 0);
    }

    private static Scanner scanner = new Scanner(System.in);
    private static final String SCHEMA = """
            %s is wrong answer ;(. Correct answer was %s.
            Let's try again, %s!
                """;

    private static final String QUESTION_AND_ANSWER = """
            Question: %s
            Your answer:\s""";

    public static void questioning(String arg) {
        System.out.printf(QUESTION_AND_ANSWER, arg);
    }

    public static void questioning(int arg) {
        System.out.printf(QUESTION_AND_ANSWER, arg);
    }

    static void congratsYouWin() {
        System.out.printf("Congratulations, %s!\n", Cli.getUserName());
        Engine.winsCount = 0;
    }

    static void correctAnswer() {
        System.out.println("Correct!");
        Engine.winsCount++;
    }

    static void wrongAnswer(String answer, String rightAnswer) {
        System.out.printf(SCHEMA, answer, rightAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }

    static void wrongAnswer(int answer, int rightAnswer) {
        System.out.printf(SCHEMA, answer, rightAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }

    static int randomize(int multiplyer) {
        return (int) (Math.random() * multiplyer);
    }

    public static int getWinsCount() {
        return winsCount;
    }
}
