package hexlet.code;


import static hexlet.code.Engine.*;

public class Calc {

    private static final String[] operators = {" + ", " - ", " * "};
    private static int currentNumber1;
    private static int currentNumber2;
    private static int rightAnswer;

    static void calcGame() {
        System.out.println("What is the result of the expression?");
        while (Engine.winsCount < 3) {
            System.out.printf(questionAndAnswer, generateQuestion());
            int answer = scanner.nextInt();
            if (answer == rightAnswer) {
                correctAnswer();
            } else {
                wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        congratsYouWin();
    }

    static String generateQuestion() {
        final int positionForCurrNum = 99;
        final int positionForOperatorChoose = 3;
        StringBuilder expr = new StringBuilder();
        currentNumber1 = randomize(positionForCurrNum);
        currentNumber2 = randomize(positionForCurrNum);
        int operatorChoose = randomize(positionForOperatorChoose);
        rightAnswer = calcRightAnswer(operatorChoose);
        expr.append(currentNumber1).append(operators[operatorChoose]).append(currentNumber2);
        return expr.toString();
    }

    static int calcRightAnswer(int num) {
        return switch (String.valueOf(num)) {
            case "0" -> currentNumber1 + currentNumber2;
            case "1" -> currentNumber1 - currentNumber2;
            case "2" -> currentNumber1 * currentNumber2;
            default -> throw new IllegalStateException("Unexpected value: " + String.valueOf(num));
        };
    }
}

