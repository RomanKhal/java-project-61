package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int NUMPOSITION = 100;

    public static void primeGame() {
        String startingPhrase = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        String[][] questionsAndAnswers = new String[Engine.WINS][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int currentNumber = Engine.randomize(NUMPOSITION);
            questionsAndAnswers[i][0] = String.valueOf(currentNumber);
            questionsAndAnswers[i][1] = isPrime(currentNumber) ? "yes" : "no";
        }
        Engine.runGame(questionsAndAnswers, startingPhrase);
    }

    private static boolean isPrime(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
