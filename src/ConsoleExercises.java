import java.io.PrintStream;
import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.println("The value of pi is approximately " + pi);
        System.out.format("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your favorite number: ");
        int userInput = scanner.nextInt();
        System.out.printf("Your favorite number is %s!%n",userInput);
        //if user enters a non-integer, get an exception InputMismatchException

        Scanner words = new Scanner(System.in);
        System.out.printf("Enter line 1: ");
        String word1 = words.nextLine();
        System.out.printf("Enter line 2: ");
        String word2 = words.nextLine();
        System.out.printf("Enter line 3: ");
        String word3 = words.nextLine();

        System.out.printf("%s%n%s%n%s%n",word1,word2,word3);
        System.out.printf("%n");

        Scanner sentence = new Scanner(System.in);
        System.out.printf("Enter a sentence. ");
        String userSentence = sentence.nextLine();

        System.out.printf("%s%n",userSentence);

        //calculate area and perimeter of codeup's classroom

        Scanner classroom = new Scanner(System.in);
        System.out.printf("How wide is Codeup\'s classroom? ");
        float classroomWidth = Float.parseFloat(classroom.nextLine());
        System.out.printf("How long is Codeup\'s classroom? ");
        float classroomLength = Float.parseFloat(classroom.nextLine());
        float area = classroomWidth * classroomLength;
        float perimeter = (classroomWidth*2)+(classroomLength*2);
        System.out.printf("Area: %f%n",area);
        System.out.printf("Perimeter: %f%n",perimeter);
    }
}
