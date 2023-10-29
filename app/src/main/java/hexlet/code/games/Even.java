package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
    private static final int NUMPOSITION = 1000;

    public static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        int[] questionData = new int[Engine.WINS];
        boolean[] rightAnswerData = new boolean[Engine.WINS];
        for (int i = 0; i < questionData.length; i++) {
            int currentNumber = Engine.randomize(NUMPOSITION);
            questionData[i] = currentNumber;
            rightAnswerData[i] = isEven(currentNumber);
        }
        Engine.runGame(questionData, rightAnswerData);
    }

    private static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
