package hexlet.code;


import java.util.Scanner;

public class Prime {

    static void primeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        String answer;
        boolean rightAnswer;
        do {
            final int numPosition = 100;
            int currentNumber = Engine.randomize(numPosition);
            rightAnswer = gettingRightAnswer(currentNumber);
            Engine.questioning(currentNumber);
            answer = new Scanner(System.in).next();
        } while (Engine.checkAnswer(answer, rightAnswer) && !Engine.haveAWinner());
        if (Engine.haveAWinner()) {
            Engine.congratsYouWin();
        }
    }

    private static boolean gettingRightAnswer(int number) {
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
