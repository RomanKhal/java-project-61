package hexlet.code;

import java.util.Scanner;

public class Calc extends Game {

    static String[] operators = {" + ", " - ", " * "};
    static int currentNumber1;
    static int currentNumber2;
    static int rightAnswer;

    static void calcGame() {
        Cli.setUserName();
        Scanner scanner = new Scanner(System.in);
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
        congrats();
    }

    static String generateQuestion() {
        StringBuilder expr = new StringBuilder();
        currentNumber1 = Engine.randomize(99);
        currentNumber2 = Engine.randomize(99);
        int operatorChoose = Engine.randomize(3);
        rightAnswer = calcRightAnswer(operatorChoose);
        expr.append(currentNumber1).append(operators[operatorChoose]).append(currentNumber2);
        return expr.toString();
    }

    static int calcRightAnswer(int num) {
        return switch (num) {
            case 0 -> currentNumber1 + currentNumber2;
            case 1 -> currentNumber1 - currentNumber2;
            case 2 -> currentNumber1 * currentNumber2;
            default -> 0;
        };
    }
}

