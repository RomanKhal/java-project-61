package hexlet.code;

public abstract class Game {
    static String schema = """
                        %s is wrong answer ;(. Correct answer was %s.
                        Let`s try again, %s!
                            """;

    static String questionAndAnswer = """
                    Question: %s
                    Your answer:\s""";

    static void congrats() {
        System.out.printf("Congratulations, %s!\n", Cli.getUserName());
        Engine.winsCount = 0;
    }

    static void correctAnswer() {
        System.out.println("Correct!");
        Engine.winsCount++;
    }

    static void wrongAnswer(String answer, String rightAnswer) {
        System.out.printf(schema, answer, rightAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }

    static void wrongAnswer(int answer, int rightAnswer) {
        System.out.printf(schema, answer, rightAnswer, Cli.getUserName());
        Engine.winsCount = 0;
    }
}
