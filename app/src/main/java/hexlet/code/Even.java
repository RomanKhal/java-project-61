package hexlet.code;

import java.util.Scanner;

public class Even extends Game {

    static void evenGame() {
        Cli.setUserName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.winsCount < 3) {
            int currentNumber = Engine.randomize(1000);
            String rightAnswer = currentNumber % 2 == 0 ? "yes" : "no";
            System.out.printf(questionAndAnswer, currentNumber);
            String answer = scanner.next();
            if (answer.equals(rightAnswer)) {
                correctAnswer();
            } else {
                wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        congrats();
    }
}
