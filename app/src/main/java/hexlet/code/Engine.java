package hexlet.code;


public class Engine {
    private static int winsCount = 0;
    public static final int WINS = 3;


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

    static void congratsYouWin() {
        System.out.printf("Congratulations, %s!\n", Cli.getUserName());
    }

    static void correctAnswer() {
        System.out.println("Correct!");
        Engine.winsCount++;
    }

    static void wrongAnswer(String answer, boolean rightAnswer) {
        String rAnswer = rightAnswer ? "yes" : "no";
        System.out.printf(SCHEMA, answer, rAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }

    static void wrongAnswer(int answer, int rightAnswer) {
        System.out.printf(SCHEMA, answer, rightAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }

    static int randomize(int multiplyer) {
        return (int) (Math.random() * multiplyer);
    }

    public static boolean haveAWinner() {
        return WINS == winsCount;
    }
}
