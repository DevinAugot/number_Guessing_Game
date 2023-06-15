/**
 * Created by: Devin Augot
 * Date: June 15th, 2023
 */
package TownSuite;

import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {

        int minNum = 1;
        int maxNum = 100;
        final int ANSWER = 42;
        boolean correct = false;

        Scanner guessScan = new Scanner(System.in);

        while (!correct) {
            System.out.println("Please guess a number between 1-100: ");
            int userGuess = guessScan.nextInt();

            if (userGuess < minNum || userGuess > maxNum) {
                System.out.println("Error Invalid Number, Try again!");
                continue;
            } else if (userGuess != ANSWER) {
                System.out.println(userGuess);
                System.out.println("Incorrect, Please Try Again!");
                continue;
            } else {
                System.out.println("Correct");
                correct = true;
            }
            System.exit(0);
        }
    }
}