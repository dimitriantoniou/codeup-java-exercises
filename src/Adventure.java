/*
Console Adventure Game!

Using what you've learned so far in the Java I module, we're going to create a classic text-based RPG game.
These types of online role-playing games date back to the 70's and solely rely on a text-based interface.
In this case, we'll be using Java to run this game in our console.

The idea is that your game will prompt the user, who will then input answers through the console (using the Scanner class).
How the game changes depending on their answer is completely up to you!
Below are a list of suggested features to get you started:
    -Ask if the user is ready to start. If they type in "yes", start the game.
    -Ask the user for their name. Store this as a variable to personalize the adventure.
    -A classic RPG will have the hero going through different scenarios and battling their enemies.
    -Display enemy stats and hero stats. Properties and values can be assigned by you.
    -For example: Health, Attack Points, etc.
    -Decide on what actions your hero can take.
    -Attack (decreases enemyHealth)
    -Drink potion (adds to heroHealth)
    -Run? (ends the game)
    -Keep asking for user input until the enemyHealth reaches 0, then end the game.

Bonuses
    -Allow the user to specify hero stats and enemy stats.
    -Automate an enemyAttack after each time the hero takes a turn.
    -End the game if either heroHealth or enemyHealth drops to 0.
    -Indicate how many potions your hero starts with. Decrement this number each time 'Use Potion' action is used.

Remember that these are only suggestions. Feel free to get creative and have fun!!

When a program is running, the runtime must keep track of what methods are called
in order to properly handle the program's control flow.
The data structure that keeps track of which methods are being called is named the stack.
While generally you don't have to worry about calling too many nested methods,
there is a finite amount of space on the stack, and when a recursive method never terminates,
it uses all the memory on the stack and we end up with a stack overflow error. ↩
 */
import java.util.Scanner;

public class Adventure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have entered the portal to the world of Middle Earth. Would you like to continue?y/n");
        boolean beginGame = scanner.nextLine().equalsIgnoreCase("y");
        if (beginGame) {
            System.out.println("Excellent. Welcome to your destiny.");
            else if (!beginGame){
                System.out.println("I am sorry to hear that. Please return when you are ready.");
                System.out.println("Would you like to return to the world of Middle Earth?");
                //beginGame = scanner.nextLine().equalsIgnoreCase("y");
            }

        }
    }
}