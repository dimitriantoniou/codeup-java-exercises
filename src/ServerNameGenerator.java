import java.util.Random;

public class ServerNameGenerator {

    //Server Name Generator
    //
    //We are going to build a server name generator. Create a class inside of src named ServerNameGenerator, and follow the specs below.
    //
    //Create two arrays whose elements are strings: one with at least 10 adjectives, another with at least 10 nouns.
    //Create a method that will return a random element from an array of strings.
    //Add a main method, and inside of your main method select and random noun and adjective and hyphenate the combination and display the generated name to the user.
    //Example Output
    //
    //
    //Here is your server name:
    //dedicated-photon

    static String[] adjectives = {"smiley","rocky","slimy","stubborn","rickety","smooth","lemony","fresh","wild","preposterous"};
    static String[] nouns = {"tree","slime","light","scale","book","hormone","elephant","bed","castle","shapeshifter"};

    static Random randomNum = new Random();

    public static String randomElement(String[] array){
        int indexRand = randomNum.nextInt(array.length);
        return array[indexRand];
    }
    public static void main (String[] args){
        System.out.printf("Your server is called: %s-%s",randomElement(adjectives),randomElement(nouns));

    }

}