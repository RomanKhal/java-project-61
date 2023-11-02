package hexlet.code.games;

import hexlet.code.Engine;
public class GCD {
    private static final int NUMPOSITION = 100;

    public static void gcdGame() {
        String startingPhrase = "Find the greatest common divisor of given numbers.";
        int rightAnswer;
        String[][] questionsAndAnswers = new String[Engine.WINS][2];
//        String[] questionData = new String[Engine.WINS];
//        int[] rightAnswerData = new int[Engine.WINS];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int currentNumber1 = Engine.randomize(NUMPOSITION);
            int currentNumber2 = Engine.randomize(NUMPOSITION);
            rightAnswer = gdc(currentNumber1, currentNumber2);
            questionsAndAnswers[i][0] = currentNumber1 + " " + currentNumber2;
            questionsAndAnswers[i][1] = String.valueOf(rightAnswer);
        }
        Engine.runGame(questionsAndAnswers, startingPhrase);
    }

    private static int gdc(int first, int second) {
        return second == 0 ? first : gdc(second, first % second);
    }
}
