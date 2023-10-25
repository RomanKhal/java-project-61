package hexlet.code;


import java.util.Scanner;

public class Calc {

    private static final String[] OPERATORS = {" + ", " - ", " * "};
    private static int currentNumber1;
    private static int currentNumber2;
    private static int rightAnswer;

    static void calcGame() {
        System.out.println("What is the result of the expression?");
        int answer;
        do {
            Engine.questioning(generateQuestion());
            answer = new Scanner(System.in).nextInt();
        } while (Engine.checkAnswer(answer, rightAnswer) && !Engine.haveAWinner());
        if (Engine.haveAWinner()) {
            Engine.congratsYouWin();
        }
    }

    static String generateQuestion() {
        final int positionForCurrNum = 99;
        StringBuilder expr = new StringBuilder();
        currentNumber1 = Engine.randomize(positionForCurrNum);
        currentNumber2 = Engine.randomize(positionForCurrNum);
        int operatorChoose = Engine.randomize(OPERATORS.length);
        rightAnswer = calcRightAnswer(operatorChoose);
        expr.append(currentNumber1).append(OPERATORS[operatorChoose]).append(currentNumber2);
        return expr.toString();
    }

    static int calcRightAnswer(int num) {
        return switch (String.valueOf(num)) {
            case "0" -> currentNumber1 + currentNumber2;
            case "1" -> currentNumber1 - currentNumber2;
            case "2" -> currentNumber1 * currentNumber2;
            default -> throw new IllegalStateException("Unexpected value: " + num);
        };
    }
}

