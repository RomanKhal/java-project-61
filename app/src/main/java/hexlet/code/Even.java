package hexlet.code;


import static hexlet.code.Engine.*;

public class Even {

    static void evenGame() {
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (Engine.winsCount < WINS) {
            int currentNumber = randomize(1000);
            String rightAnswer = currentNumber % 2 == 0 ? "yes" : "no";
            Engine.questioning(currentNumber);
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
}
