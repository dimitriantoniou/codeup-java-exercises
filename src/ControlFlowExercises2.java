import java.util.Scanner;

public class ControlFlowExercises2 {
    public static void main(String[] args) {

        //1 Loop Basics
        Integer i = 5;
        while (i <= 15) {
            System.out.println(i);
            i += 1;
        }

        Integer a = 0;
        System.out.printf("%d%n", a);
        do {
            a += 2;
            System.out.printf("%d%n", a);
        } while (a >= 0 && a < 100);

        Integer b = 100;
        System.out.printf("%d%n", b);
        do {
            b -= 5;
            System.out.printf("%d%n", b);
        } while (b < 100 && b > 0);

        Integer c = 2;
        System.out.printf("%d%n", c);
        do {
            c = c * c;
            System.out.printf("%d%n", c);
        } while (c < 10000);

        for (int d = 2; d < 10000; d *= d) {
            System.out.println(d);
        }

        //2 fizzbuzz
        for (int x = 1; x < 101; x++) {
            if (x % 3 == 0 && x % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (x % 3 == 0) {
                System.out.println("Fizz");
            } else if (x % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.printf("%d%n", x);
            }
        }

        //3 table of powers
        Scanner sc = new Scanner(System.in);
        boolean userContinue = true;
        do {
            Scanner scan = new Scanner(System.in);
            System.out.println("Please enter an integer");
            int userInput = scan.nextInt();
            System.out.printf("number | squared | cubed %n");
            for (int y = 1; y < userInput; y++) {
                System.out.printf("%d   |%d     |%d    %n", y, y * y, y * y * y);
            }

            System.out.println("Would you like to continue? Y/N");
            String userResponse = scan.next();
            if (!userResponse.equalsIgnoreCase("y")) {
                userContinue = false;
            }
        } while (userContinue);

        //4 grade application
        Scanner scanGrade = new Scanner (System.in);
        boolean gradesContinue = true;
        do{
            System.out.println("Please enter a number grade from 0 to 100");
            int numberGrade = scanGrade.nextInt();
            if (numberGrade>=88){
                System.out.println("A :D");
            }else if (numberGrade >=80){
                System.out.println("B!");
            }else if (numberGrade >=67){
                System.out.println("C");
            }else if (numberGrade >=60){
                System.out.println("D...");
            }else{
                System.out.println("You failed :/");
            }

            System.out.println("Would you like to continue?");
            String userGradeResponse = scanGrade.next();
            if (!userGradeResponse.equalsIgnoreCase("u")){
                gradesContinue = false;
            }
        }while (gradesContinue);


    }
}