import java.util.Random;
import java.util.Scanner;

public class codsoft_task1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1, maxRange = 100, maxAttempts = 5;
        int score = 0;

        System.out.println("Welcome to Number Guessing Game: ");

        boolean Play = true;

        while (Play) {
            int target = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Select a Number between the Range " + minRange + " to " + maxRange + " ");
            int Attempts = 0;

            while (Attempts < maxAttempts) {
                System.out.println("Enter your guess Number: ");
                int guess = s.nextInt();
                Attempts++;

                if (guess == target) {
                    System.out.println("Congratulations, Your Guess is Correct in " + Attempts + " Attempts");
                    score++;
                    break;
                }

                else if (guess < target) {
                    System.out.println("Yours Guess is too Low.");
                }

                else if (guess > target) {
                    System.out.println("Your Guess is too High.");
                }
            }

            if (Attempts == maxAttempts) {
                System.out.println("Sorry You have reached Maximum Attempts.");
            }

            System.out.println("Do you want to Play Again (yes/no)");
            String Playresponse = s.next().toLowerCase();
            Play = Playresponse.equals("yes");
        }

        System.out.println("Thankyou for Playing Number Guessing Game: ");
        System.out.println("Your total Score : " + score);

    }
}
