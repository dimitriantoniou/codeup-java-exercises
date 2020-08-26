public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");


// Step 1: create an int variable and assign favorite number
    int myFavoriteNumber = 22;
    System.out.println(myFavoriteNumber);

//  Step 2: create a string variable named myString
    double myString;

//  Step 3: Change your code to assign the value 3.14159 to myString
    myString = 3.14159;

//  Step 4: Change your code to assign the value 3.14159 to myString
        /* myString = 3.1459;  This produces an error*/

//  Step 5: Declare a long variable named myNumber, but do not assign anything to it. Next print out myNumber.
    //long myNumber;

// Causes an error, variable myNumber might not be initialized.

// step 6: Change your code to assign the value 3.14 to myNumber. What do you notice?
      //myNumber = 3.14;
                //needs to be a long type
// step 7: Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
       // myNumber = 123L;
// step 8: Change your code to assign the value 123 to myNumber.
        // myNumber = 123;
// Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?
// step 10: Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
    float myNumber = (float) 3.14;
    }
}