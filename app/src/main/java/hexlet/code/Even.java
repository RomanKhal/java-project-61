package hexlet.code;


import java.util.Scanner;


public class Even {

    static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.getWinsCount() < Engine.WINS) {
            final int numPosition = 1000;
            int currentNumber = Engine.randomize(numPosition);
            String rightAnswer = currentNumber % 2 == 0 ? "yes" : "no";
            Engine.questioning(currentNumber);
            String answer = new Scanner(System.in).next();
            if (answer.equals(rightAnswer)) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        Engine.congratsYouWin();
    }
}
