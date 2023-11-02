package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {
    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static final int NUMPOSITION = 99;

    public static void calcGame() {
        String startingPhrase = "What is the result of the expression?";
        String[][] questionsAndAnswers = new String[Engine.WINS][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {
            int currentNumber1 = Engine.randomize(NUMPOSITION);
            int currentNumber2 = Engine.randomize(NUMPOSITION);
            int operator = Engine.randomize(OPERATORS.length);
            int rightAnswer = calcRightAnswer(operator, currentNumber1, currentNumber2);
            questionsAndAnswers[i][0] = currentNumber1 + OPERATORS[operator] + currentNumber2;
            questionsAndAnswers[i][1] = String.valueOf(rightAnswer);
        }
        Engine.runGame(questionsAndAnswers, startingPhrase);
    }

    private static int calcRightAnswer(int operator, int currentNumber1, int currentNumber2) {
        return switch (String.valueOf(operator)) {
            case "0" -> currentNumber1 + currentNumber2;
            case "1" -> currentNumber1 - currentNumber2;
            case "2" -> currentNumber1 * currentNumber2;
            default -> throw new IllegalStateException("Unexpected value: " + operator);
        };
    }
}

