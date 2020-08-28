import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
//While
// Create an integer variable i with a value of 5.
// Create a while loop that runs so long as i is less than or equal to 15
// Each loop iteration, output the current value of i, then increment i by one.
// Your output should look like this:5 6 7 8 9 10 11 12 13 14 15
/*
    int i =5;
    while (i<= 15){
        i++;
        System.out.println(i);
}
*/

//Do While
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//Alter your loop to count backwards by 5's from 100 to -10.
//Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000.
//2
// 4
// 16
// 256
// 65536
        /*
        int i =0;
        do {
            i+=2;
            System.out.println(i);
        }while(i<100);
    }
          */
        /*
        int i=100;
        do {
            i+=-2;
            System.out.println(i);
        }while(i>-10);
        */
        /*
        for (int i=5; i<16;i+=1){
            System.out.println(i);
        }
         */
        /*
        for (int i=0; i<100;i+=2){
            System.out.println(i);
        }
         */
        /*
        for (int i=100;i>-10;i+=-2){
            System.out.println(i);
        }
         */
        /*
for (int i=0;i<=100;i++){
    //System.out.println(i);
    if(i%3==0){
        System.out.println("Fizz");
    }else if (i%5==0){
        System.out.println("Buzz");
    }else if (i%3 ==0 && i%5 ==0){
        System.out.println("FizzBuss");
    }
}
         */
/*
Scanner scanner = new Scanner(System.in);
System.out.println("Please enter an integer:");
int userInteger = scanner.nextInt();
System.out.println("Here's a table:");
System.out.println("number | squared | cubed");

for (int i=1;i<=userInteger;i++){
    int square = i*i;
    int cubed = i*i*i;
    System.out.printf("%d      |%d         |%d        %n",i,square,cubed);
    System.out.println("Would you like to continue? y/n");
    String userInput = scanner.next();
    boolean userConfirmation = userInput.equalsIgnoreCase("y");
    if (!userConfirmation){
        break;
 */



    }
}



    }
}