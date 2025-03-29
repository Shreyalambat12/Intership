 import java.util.Random;
import java.util.Scanner;
public class numbergame{
  public static void main(String[] args) {

    int numberToGuess = generateRandomNumber();

    int numberOfTries = 0;
    int maxTries = 5;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Welcome to the Number Guessing Game....");
    System.out.println(" I am thinking of Number between 1 to 90");

    while (numberOfTries < maxTries) {
      System.out.println(" Enter Your Guessed Number:");
      int userGuess = scanner.nextInt();

      if (userGuess < 1 || userGuess > 90) {
        System.out.println(" Invalid Guess. Please Enter a Number between 1 to 90 ");
        continue;
      }
      numberOfTries++;

      if (userGuess == numberToGuess) {
        System.out.println(" Congrats! You guessed the number in" + numberOfTries + " tries");
        break;
      } else if (userGuess < numberToGuess) {
        System.out.println(" Too small... Try again.");
      } else {
        System.out.println(" Too big.... Try again.");
      }
    }
    if (numberOfTries == maxTries) {
      System.out.println(
          " Sorry, you didn't guess the number in" + maxTries + " tries. The Number was" + numberToGuess + ".");
    }
    scanner.close();
  }

  private static int generateRandomNumber() {
    Random random = new Random();
    return random.nextInt(90) + 1;
  }
}

