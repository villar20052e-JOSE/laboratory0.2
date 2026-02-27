import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(30) + 1;

        int attempts = 0;
        int counter = 0;

        System.out.println("Guess the secret number (1 to 30)");

        do {
            System.out.print("Enter a number: ");
            attempts = input.nextInt();
            counter++;

            if (attempts == secretNumber) {
                System.out.println("Correct! You guessed the number, congratulations!");
            } else if (Math.abs(attempts - secretNumber) <= 5) {
                System.out.println("You are close to the number!");
            } else if (attempts < secretNumber) {
                System.out.println("The number is too low");
            } else {
                System.out.println("The number is too high");
            }

        } while (attempts != secretNumber);

        System.out.println("Attempts made: " + counter);

        input.close();
    }
}