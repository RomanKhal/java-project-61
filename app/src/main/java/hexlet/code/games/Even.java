package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int NUMPOSITION = 1000;

    public static void evenGame() {
        String startingPhrase = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[Engine.WINS][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int currentNumber = Engine.randomize(NUMPOSITION);
            questionsAndAnswers[i][0] = String.valueOf(currentNumber);
            questionsAndAnswers[i][1] = isEven(currentNumber) ? "yes" : "no";
        }
        Engine.runGame(questionsAndAnswers, startingPhrase);
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
