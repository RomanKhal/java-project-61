package hexlet.code.games;

import hexlet.code.Engine;
public class Calc {

    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static int rightAnswer;
    public static void calcGame() {
        System.out.println("What is the result of the expression?");
        String[] questionData = new String[Engine.WINS];
        int[] rightAnswerData = new int[Engine.WINS];
        for (int i = 0; i < questionData.length; i++) {
            questionData[i] = generateQuestion();
            rightAnswerData[i] = rightAnswer;
        }
        Engine.runGame(questionData, rightAnswerData);
    }
    private static String generateQuestion() {
        final int positionForCurrNum = 99;
        StringBuilder expr = new StringBuilder();
        int currentNumber1 = Engine.randomize(positionForCurrNum);
        int currentNumber2 = Engine.randomize(positionForCurrNum);
        int operatorChoose = Engine.randomize(OPERATORS.length);
        rightAnswer = calcRightAnswer(operatorChoose, currentNumber1, currentNumber2);
        expr.append(currentNumber1).append(OPERATORS[operatorChoose]).append(currentNumber2);
        return expr.toString();
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

