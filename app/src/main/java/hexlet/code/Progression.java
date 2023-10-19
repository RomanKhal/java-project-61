package hexlet.code;


import java.util.Scanner;

public class Progression {

    public static void progressionGame() {
        System.out.println("What number is missing in the progression?");
        while (Engine.getWinsCount() < Engine.WINS) {
            int[] progression = generateProgression();
            int index = Engine.randomize(progression.length);
            int rightAnswer = progression[index];
            Engine.questioning(strArrForPrint(progression, index));
            int answer = new Scanner(System.in).nextInt();
            if (answer == rightAnswer) {
                Engine.correctAnswer();
            } else {
                Engine.wrongAnswer(answer, rightAnswer);
                return;
            }
        }
        Engine.congratsYouWin();
    }

    static int[] generateProgression() {
        final int size = 10;
        int[] arr = new int[size];
        int step = Engine.randomize(arr.length - 1) + 1;
        arr[0] = Engine.randomize(arr.length - 1) + 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + step;
        }
        return arr;
    }

    static String strArrForPrint(int[] arr, int index) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (i == index) {
                result.append("..");
            } else {
                result.append(arr[i]);
            }
            result.append(" ");
        }
        return result.toString();
    }
}
