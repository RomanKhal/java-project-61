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


    public static void runGame(String[] questions, int[] rightAnswers) {
        int answer;
        for (int i = 0; i < WINS; i++) {
            questioning(questions[i]);
            answer = new Scanner(System.in).nextInt();
            if (!checkAnswer(answer, rightAnswers[i])) {
                return;
            }
        }
        congratsYouWin();
    }
    public static void runGame(int[] questions, boolean[] rightAnswers) {
        String answer;
        for (int i = 0; i < WINS; i++) {
            questioning(questions[i]);
            answer = new Scanner(System.in).next();
            if (!checkAnswer(answer, rightAnswers[i])) {
                return;
            }
        }
        congratsYouWin();
    }
    public static void questioning(String arg) {
        System.out.printf(QUESTION_AND_ANSWER, arg);
    }

    public static void questioning(int arg) {
        System.out.printf(QUESTION_AND_ANSWER, arg);
    }

    public static boolean checkAnswer(String answer, boolean rightAnswer) {
        if (answer.equals("yes") && rightAnswer
                || answer.equals("no") && !rightAnswer) {
            correctAnswer();
            return true;
        }
        wrongAnswer(answer, rightAnswer);
        return false;
    }

    public static boolean checkAnswer(int answer, int rightAnswer) {
        if (answer == rightAnswer) {
            correctAnswer();
            return true;
        }
        wrongAnswer(answer, rightAnswer);
        return false;    }

    public static void congratsYouWin() {
        System.out.printf("Congratulations, %s!\n", Cli.getUserName());
    }

    static void correctAnswer() {
        System.out.println("Correct!");
    }

    static void wrongAnswer(String answer, boolean rightAnswer) {
        String rAnswer = rightAnswer ? "yes" : "no";
        System.out.printf(SCHEMA, answer, rAnswer, Cli.getUserName());
    }

    static void wrongAnswer(int answer, int rightAnswer) {
        System.out.printf(SCHEMA, answer, rightAnswer, Cli.getUserName());
    }

    public static int randomize(int multiplayer) {
        return (int) (Math.random() * multiplayer);
    }
}
