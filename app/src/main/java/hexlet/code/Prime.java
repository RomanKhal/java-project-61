package hexlet.code;

import static hexlet.code.Engine.*;

public class Prime {
    static int currentNumber;
    static void primeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.winsCount < 3) {
            currentNumber = randomize(100);
            String rightAnswer = gettingRightAnswer(currentNumber);
            System.out.printf(questionAndAnswer, currentNumber);
            String answer = scanner.next();
            if (answer.equals(rightAnswer)) {
                correctAnswer();
            } else {
                wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        congratsYouWin();
    }

    private static String gettingRightAnswer(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return "no";
            }
        }
        return "yes";
    }
}
