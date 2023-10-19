package hexlet.code;


public class Prime {
    static void primeGame() {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        while (Engine.winsCount < Engine.WINS) {
            int currentNumber = Engine.randomize(100);
            String rightAnswer = gettingRightAnswer(currentNumber);
            Engine.questioning(currentNumber);
            String answer = Engine.scanner.next();
            if (answer.equals(rightAnswer)) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        Engine.congratsYouWin();
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
