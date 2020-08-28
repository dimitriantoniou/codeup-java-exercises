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
    /*
    public static void getInteger(int min, int max){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1,10);
        return;
    }
     */


    public static void main(String[] args) {
        System.out.println(addition(1, 4));
        System.out.println(subtraction(1, 4));
        System.out.println(multiplication(1, 4));
        System.out.println(division(1, 4));
        System.out.println(modulus(1, 4));
    }
}