package hexlet.code;



public class GCD {

    public static void gcdGame() {
        System.out.println("Find the greatest common divisor of given numbers.");
        while (Engine.winsCount < Engine.WINS) {
            final int NUM_POSITION = 100;
            int currentNumber1 = Engine.randomize(NUM_POSITION);
            int currentNumber2 = Engine.randomize(NUM_POSITION);
            int rightAnswer = gdc(currentNumber1, currentNumber2);
            Engine.questioning(currentNumber1 + " " + currentNumber2);
            int answer = Engine.scanner.nextInt();
            if (answer == rightAnswer) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        Engine.congratsYouWin();
    }

    private static int gdc(int first, int second) {
        return second == 0 ? first : gdc(second, first % second);
    }
}
