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
        System.out.printf("%d%n",b);
        do

        {
            b -= 5;
            System.out.printf("%d%n", b);
        }while(b<100&&b>0);
    }
}