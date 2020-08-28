import java.util.Scanner;
public class MethodsExercises {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        public static double additionAB(double a, double b){
            double sum = a + b;
            System.out.printf("%d + %d = %d%n", a, b, sum);
        }
        public static double subtractionAB(int a, int b){
            int sumSubtracted = a-b;
            System.out.printf("%d-%d=%d%n",a,b,sumSubtracted);
        }
        public static void multiplicationAB(int a, int b){
            int product = a * b;
            System.out.printf("%d * %d = %d%n",a,b,product);
        }
        public static void divisionAB(int a, int b){
            int divided = a/b;
            System.out.printf("%d / %d = %d%n",a,b,divided);
        }
        public static void modulusAB(int a, int b){
            int modulus = a%b;
            System.out.printf("%d % %d = %d%n",a,b,modulus);
        }
    }
}