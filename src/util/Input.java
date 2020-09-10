package util;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public static String getString(){
        String returnString = sc.nextLine();
        return returnString
    }

    public static String getString(String prompt){
        System.out.printf("%s%n",prompt);
        String returnString = sc.nextLine();
        return returnString;
    }

    public static boolean yesNo() {
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes")){
    return true;
        }else{
    return false;
        }
    }

    public static boolean yesNo(String prompt){
        System.out.printf("%s%n",prompt);
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes"))) {
            return true;
        } else {
            return false;
        }
    }

    public static int getInt(int min, int max){
        System.out.printf("Please give an integer between %d and %d",min,max);
        int input = Integer.parseInt(sc.nextLine());
        if(input<min) {
            System.out.println("That is too low - try again! ");
            return getInt(min, max);
        }else if(input>max) {
            System.out.println("That is too high - try again! ");
            return getInt(min, max);
        }
        System.out.printf("Great! %d is between %d and %d.",input,min,max);
        return input;
    }

    public static int getInt(){
        int input = Integer.parseInt(sc.nextLine());
        return input;
    }

    public static double getDouble(double min, double max) {
        System.out.printf("Please enter a double between %d and %d. Hint: use a decimal!", min, max)
        double input = Double.parseDouble(sc.nextLine());
        if (input < min) {
            System.out.println("That is too low - try again! ");
            return getDouble(min, max);
        } else if (input > max) {
            System.out.println("That is too high - try again! ");
            return getDouble(min, max);
        }
        System.out.printf("Great, %d is between %d and %d. ", input, min, max);
        return input;
    }

   public static double getDouble(){
      double input = Double.parseDouble(sc.nextLine());
      return input;
    }

    public static double getDouble(String prompt){
        System.out.printf("%s%n",prompt);
        double input = Double.parseDouble(sc.nextLine());
        return input;
    }
}