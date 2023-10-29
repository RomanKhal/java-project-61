package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
    private static final int NUMPOSITION = 100;

    public static void primeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] questionData = new int[Engine.WINS];
        boolean[] rightAnswerData = new boolean[Engine.WINS];
        for (int i = 0; i < questionData.length; i++) {
            int currentNumber = Engine.randomize(NUMPOSITION);
            questionData[i] = currentNumber;
            rightAnswerData[i] = isPrime(currentNumber);
        }
        Engine.runGame(questionData, rightAnswerData);
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
