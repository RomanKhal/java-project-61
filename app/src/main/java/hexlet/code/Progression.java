package hexlet.code;


public class Progression extends Game {

    public static void progressionGame() {
        System.out.println("What number is missing in the progression?");
        while (Engine.winsCount < 3) {
            int[] progression = generateProgression();
            int index = randomize(progression.length);
            int rightAnswer = progression[index];
            System.out.printf(questionAndAnswer,strArrForPrint(progression, index));
            int answer = scanner.nextInt();
            if (answer == rightAnswer) {
                correctAnswer();
            } else {
                wrongAnswer(answer,rightAnswer);
                return;
            }
        }
        congratsYouWin();
    }

     static int[] generateProgression() {
        int [] arr = new int[10];
        int step = randomize(9) + 1;
        arr[0] = randomize(9) + 1;
        for (int i = 1; i < arr.length; i++) {
            arr[i] = arr[i-1] + step;
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
