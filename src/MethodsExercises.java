import java.util.Scanner;

public class MethodsExercises {

    public static int addition(int a, int b) {
        return a + b;
    }

    public static int subtraction(int a, int b) {
        return a - b;
    }

    public static int multiplication(int a, int b) {
        return a * b;
    }

    public static int division(int a, int b) {
        return a / b;
    }

    public static int modulus(int a, int b) {
        return a % b;
    }

    public static int validateInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        Scanner sc = new Scanner (System.in);
        int userInput = sc.nextInt();
        if (userInput >=min && userInput <=max){
            System.out.println("That works!");
            return userInput;
        }else{
            System.out.println("That doesn't work :( Please enter another number!");
            return validateInteger(min, max);
        }
    }

    public static void askNumber (){
        Scanner scanner = new Scanner (System.in);
        System.out.println(("Please enter a number between 1 and 10"));
        int userInput = validateInteger (1,10);
        long fact = userInput;
        for (int i =1; i <userInput; i++){
            fact = fact *i;
        }
        System.out.println(userInput + "! = " + fact);
        System.out.println("Do you want to continue? Y/N");
        String userContinue = scanner.next();
        if(userContinue.equalsIgnoreCase("y")){
            askNumber();
        }else{
            System.out.println("Bye bye!");
        }
    }

    public static void rollDice (){
        Scanner dice = new Scanner (System.in);
        System.out.println("Enter the number of sides on your pair of dice.");
        System.out.println("Do you want to roll the dice? Y/N");
        String userRoll = dice.next();
        if(userRoll.equalsIgnoreCase("y")){
            //roll the n-sided dice; generate random numbers with. random and java.lang.math
            //System.out.println(roll results
        }
        System.out.println("Do you want to continue? Y/N");
        //if yes, rollDice()
        //if no, exit out
    }


    public static void main(String[] args) {
        System.out.println(addition(1, 4));
        System.out.println(subtraction(1, 4));
        System.out.println(multiplication(1, 4));
        System.out.println(division(1, 4));
        System.out.println(modulus(1, 4));
    }

}