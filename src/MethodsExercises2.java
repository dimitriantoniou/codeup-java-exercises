import java.util.Scanner;

public class MethodsExercises2 {

        //Basic Arithmetic
        //
        //Create four separate methods. Each will perform an arithmetic operation:
        //
        //Addition
        //Subtraction
        //Multiplication
        //Division
        //Each function needs to take two parameters/arguments so that the operation can be performed.
        //
        //Test your methods and verify the output.
        //
        //Add a modulus method that finds the modulus of two numbers.
        //
        //Food for thought: What happens if we try to divide by zero? What should happen?
        //addition
        public static int addition(int a, int b){
            int sum = a+b;
            System.out.printf("%d + %d = %d%n",a,b,sum);
            return sum;
        }

        public static int subtraction(int x, int y){
            int sumSubtraction = x-y;
            System.out.printf("%d - %d = %d%n",x,y,sumSubtraction);
            return sumSubtraction;
        }

        public static int multiplication(int c, int d){
            int product = c*d;
            System.out.printf("%d * %d = %d%n",c,d,product);
            return product;
        }

        public static int division(int e, int f){
            int quotient = e/f;
            int remainder = e%f;
            System.out.printf("%d / %d = %d with a remainder of %d%n",e,f,quotient,remainder);
            return quotient;
        }

        //2 Create a method that validates that user input is in a certain range
        // set min and max parameters
        //prompt user for an input
        //if input is not in the min max range, re-prompt user for an input
        //if input IS in the min max range, print X is between A and B.
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in);//imports scanner
        System.out.printf("Please enter a number between %d and %d: ",min,max);

        if (sc.hasNextInt()) {
            int userInput = sc.nextInt();
            if(userInput >= min && userInput <= max){
                return userInput;
            }else{
                System.out.println("That number is out of range!");
                return getInteger(min,max);
            }
        }else{
            System.out.println("Not a number - please try again!");
            getInteger(min, max);
            }
        return 0;
    }


        public static void main (String [] args){
            addition(1,1);
            subtraction(1,1);
            multiplication(2,2);
            division(10,3);
            getInteger(1,10);
    }

}
