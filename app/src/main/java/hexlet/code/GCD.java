package hexlet.code;

import java.util.Scanner;

public class GCD extends Game {
    static int currentNumber1;
    static int currentNumber2;
    static int rightAnswer;

    public static void gcdGame() {
        Cli.setUserName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Find the greatest common divisor of given numbers.");
        while (Engine.winsCount < 3) {
            currentNumber1 = Engine.randomize(100);
            currentNumber2 = Engine.randomize(100);
            rightAnswer = gdc(currentNumber1, currentNumber2);
            System.out.printf(questionAndAnswer, currentNumber1 + " " + currentNumber2);
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

    private static int gdc(int first, int second) {
        return second == 0 ? first : gdc(second, first % second);
    }
}
