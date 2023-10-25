package hexlet.code;


import java.util.Scanner;


public class Even {

    static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        String answer;
        boolean rightAnswer;
        do {
            final int numPosition = 1000;
            int currentNumber = Engine.randomize(numPosition);
            rightAnswer = isEven(currentNumber);
            Engine.questioning(currentNumber);
            answer = new Scanner(System.in).next();

        } while (Engine.checkAnswer(answer, rightAnswer) && !Engine.haveAWinner());
        if (Engine.haveAWinner()) {
            Engine.congratsYouWin();
        }
    }

    static boolean isEven(int currentNumber) {
        return currentNumber % 2 == 0;
    }
}
