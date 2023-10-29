package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    private static final int NUMPOSITION = 100;
    public static void gcdGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int rightAnswer;
        String[] questionData = new String[Engine.WINS];
        int[] rightAnswerData = new int[Engine.WINS];
        for (int i = 0; i < questionData.length; i++) {
            int currentNumber1 = Engine.randomize(NUMPOSITION);
            int currentNumber2 = Engine.randomize(NUMPOSITION);
            rightAnswer = gdc(currentNumber1, currentNumber2);
            questionData[i] = currentNumber1 + " " + currentNumber2;
            rightAnswerData[i] = rightAnswer;
        }
        Engine.runGame(questionData, rightAnswerData);
    }
    private static int gdc(int first, int second) {
        return second == 0 ? first : gdc(second, first % second);
    }
}
