package hexlet.code.games;

import hexlet.code.Engine;
public class Progression {
    private static final int LEN = 10;
    public static void progressionGame() {
        System.out.println("What number is missing in the progression?");
        String[] questionData = new String[Engine.WINS];
        int[] rightAnswerData = new int[Engine.WINS];
        for (int i = 0; i < questionData.length; i++) {

            int firstElem = Engine.randomize(LEN - 1) + 1;
            int step = Engine.randomize(LEN - 1) + 1;
            int[] progression = generateProgression(firstElem, step, LEN);
            int index = Engine.randomize(progression.length);
            questionData[i] = strArrForPrint(progression, index);
            rightAnswerData[i] = progression[index];
        }
        Engine.runGame(questionData, rightAnswerData);
    }
    private static int[] generateProgression(int firstElem, int step, int len) {
        int[] arr = new int[len];
        arr[0] = firstElem;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] + step;
        }
        return arr;
    }
    private static String strArrForPrint(int[] arr, int index) {
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
