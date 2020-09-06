import java.util.Scanner;

public class ConsoleExercises2 {
    public static void main(String[] args) {
        //double pi = 3.14159;
        //System.out.println("The value of pi is approximately 3.14.");
        //System.out.format("The value of pi is approximately %.2f%n.",pi);

        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter a number!");
        int userNumber = sc.nextInt();
        System.out.printf("Your entered %d!%n",userNumber);

        Scanner sc2 = new Scanner (System.in);
        System.out.println("Please give me a random word! ");
        String wordOne = sc2.next();
        System.out.println("Please give me a random word! ");
        String wordTwo = sc2.next();
        System.out.println("Please give me a random word! ");
        String wordThree = sc2.next();
        System.out.printf("%s%n%s%n%s%n",wordOne,wordTwo,wordThree);
    }
}