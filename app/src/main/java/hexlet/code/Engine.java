package hexlet.code;


import java.util.Scanner;

public class Engine {
    public static final int WINS = 3;

    private static final String SCHEMA = """
            %s is wrong answer ;(. Correct answer was %s.
            Let's try again, %s!
            """;

    private static final String QUESTION_AND_ANSWER = """
            Question: %s
            Your answer:\s""";

    public static void runGame(String[][] questionsAndAnswers, String startingPhrase) {
        System.out.print("\nWelcome to the Brain Games!\nMay I have your name? ");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.next();
        System.out.printf("Hello, %s!\n", userName);
        System.out.println(startingPhrase);
        for (int i = 0; i < WINS; i++) {
            System.out.printf(QUESTION_AND_ANSWER, questionsAndAnswers[i][0]);
            String answer = new Scanner(System.in).next();
            if (answer.equals(questionsAndAnswers[i][1])) {
                System.out.println("Correct!");
            } else {
                System.out.printf(SCHEMA, answer, questionsAndAnswers[i][1], userName);
                return;
            }
        }
        System.out.printf("Congratulations, %s!\n", userName);
    }

    public static int randomize(int multiplayer) {
        return (int) (Math.random() * multiplayer);
    }
}
