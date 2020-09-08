package util;
import java.util.Scanner;

public class Input {
    private static Scanner sc = new Scanner(System.in);

    public String getString(){
        return sc.next();
    }

    public void yesNo() {
        System.out.println("Would you like to continue? y/n");
        String userInput = sc.nextLine();
        if (userInput.equalsIgnoreCase("y") || (userInput.equalsIgnoreCase("yes"))) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }

    public int getInt(int min, int max){//syntax error expecting a ; here
        System.out.printf("Please give an integer between %d and %d",min,max);
        int input = Integer.parseInt(sc.nextLine());
        if(input>min && input<max) {
            System.out.printf("%d works",sc.nextInt());
        }else{
            System.out.printf("Please try again!");
    }

    //public int getInt(){
      //  int input = Integer.parseInt(sc.nextLine());
        //return input;
    //}

    public double getDouble(double min, double max){
        System.out.printf("Please enter a double between %d and %d. Hint: use a decimal!",min,max)
            double inputDouble = Double.parseDouble(sc.nextLine());
        if (inputDouble>min && inputDouble < max){
            System.out.printf("Geat, %d is between %d and %d.",inputDouble,min,max);
        }else{
            System.out.println("Sorry, please try again.");
        }
    }

   // public double getDouble(){
      //  return ;
    //}

}
}