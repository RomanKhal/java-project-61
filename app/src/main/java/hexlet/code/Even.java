package hexlet.code;

import java.util.Scanner;

public class Even {


    static void evenGame() {
        Cli.setUserName();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
        while (App.winsCount < 3) {
            int currentNumber = randomize();
            String rightAnswer = currentNumber % 2 == 0 ? "yes" : "no";
            System.out.printf("""
                    Question: %s
                    Your answer:\s""", currentNumber);
            String answer = scanner.next();
            if (answer.equals(rightAnswer)) {
                System.out.println("Correct!");
                App.winsCount++;
            } else {
                String schema = """
                        %s is wrong answer ;(. Correct answer was %s.
                        Let`s try again, %s!
                            """;
                System.out.printf(schema, answer, rightAnswer, Cli.getUserName());
                App.winsCount = 0;
                App.chooseMenu();
            }
        }
        System.out.printf("Congratulations, %s!\n", Cli.getUserName());
    }

    static int randomize() {
        return (int) (Math.random() * 1000);
    }
}
