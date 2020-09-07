import java.util.Random;
import java.util.Scanner;

public class HighLow {
    public static void main (String [] args){

//Game picks a random number between 1 and 100.
//Prompts user to guess the number.
//All user inputs are validated.
//If user's guess is less than the number, it outputs "HIGHER".
//If user's guess is more than the number, it outputs "LOWER".
//If a user guesses the number, the game should declare "GOOD GUESS!"
        int min = 0;
        int max = 100;
        int count = 0;
        int randomNumber = (int)(Math.random()*(max-min+1)+min);
        System.out.println("What number am I thinking of between 1 and 100? You have three guesses");
        Scanner sc = new Scanner(System.in);
        int userGuess = sc.nextInt();

        if (userGuess == randomNumber && count<4) {
            System.out.println("Good Guess!");
        }else if (count>=4) {
            System.out.println("Sorry, you're out of guesses.");
        }else if (userGuess > randomNumber && count<4) {
            System.out.println("LOWER");
            count++;
            userGuess = sc.nextInt();
        }else if (userGuess < randomNumber && count<4) {
            System.out.println("Higher");
            count++;
            userGuess = sc.nextInt();
        }
    }
}
