package hexlet.code;


import java.util.Scanner;

public class GCD {


    public static void gcdGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        int answer;
        int rightAnswer;
        do {
            final int numPosition = 100;
            int currentNumber1 = Engine.randomize(numPosition);
            int currentNumber2 = Engine.randomize(numPosition);
            rightAnswer = gdc(currentNumber1, currentNumber2);
            Engine.questioning(currentNumber1 + " " + currentNumber2);
            answer = new Scanner(System.in).nextInt();
        } while (Engine.checkAnswer(answer, rightAnswer) && !Engine.haveAWinner());
        if (Engine.haveAWinner()) {
            Engine.congratsYouWin();
        }
    }

    private static int gdc(int first, int second) {
        return second == 0 ? first : gdc(second, first % second);
    }
}
