import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

        public static int addition(int a, int b){
            int sum = a + b;
            System.out.printf("%d + %d = %d%n", a, b, sum);
        }
        public static double subtraction(int a, int b){
            int sumSubtracted = a-b;
            System.out.printf("%d-%d=%d%n",a,b,sumSubtracted);
        }
        public static void multiplication(int a, int b){
            int product = a * b;
            System.out.printf("%d * %d = %d%n",a,b,product);
        }
        public static void division(int a, int b){
            int divided = a/b;
            System.out.printf("%d / %d = %d%n",a,b,divided);
        }
        public static void modulus(int a, int b){
            int modulused = a%b;
            System.out.printf("%d % %d = %d%n",a,b,modulus);
        }
    }
}