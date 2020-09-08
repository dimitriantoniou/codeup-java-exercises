package util;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public String getString(){
        String newString = sc.next();
        return newString;
    }

    public boolean yesNo(){
        System.out.println("Would you like to continue? y/n");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes"))) {
            System.out.println("True");
        }else{
            System.out.println("False");
    }

    public int getInt(int min, int max){
        System.out.printf("Please give an integer between %d and %d",min,max);
        int input = Integer.parseInt(sc.nextLine());
        if(input>min && input<max) {
            System.out.printf("Please try again!");
        }else{
            System.out.printf("%d works",sc.nextInt());
            return input;
    }

    public int getInt(){

    }

    public double getDouble(double min, double max){
        System.out.printf("Please enter a double between %d and %d. Hint: use a decimal!",min,max)
            return ;
    }

    public double getDouble(){
        return ;
    }

}
