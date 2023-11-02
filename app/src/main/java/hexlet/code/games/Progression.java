package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    private static final int LEN = 10;

    public static void progressionGame() {
        String startingPhrase = "What number is missing in the progression?";
        String[][] questionsAndAnswers = new String[Engine.WINS][2];
        for (int i = 0; i < questionsAndAnswers.length; i++) {

            int firstElem = Engine.randomize(LEN - 1) + 1;
            int step = Engine.randomize(LEN - 1) + 1;
            String[] progression = generateProgression(firstElem, step, LEN);
            int index = Engine.randomize(progression.length);
            questionsAndAnswers[i][1] = progression[index];
            questionsAndAnswers[i][0] = strArrForPrint(progression, index);
        }
        Engine.runGame(questionsAndAnswers, startingPhrase);
    }

    private static String[] generateProgression(int firstElem, int step, int len) {
        String[] arr = new String[len];
        arr[0] = String.valueOf(firstElem);
        for (int i = 1; i < arr.length; i++) {
            arr[i] = String.valueOf(Integer.parseInt(arr[i - 1]) + step);
        }
        return arr;
    }

    private static String strArrForPrint(String[] arr, int index) {
        arr[index] = "..";
        return String.join(" ", arr);
    }
}
