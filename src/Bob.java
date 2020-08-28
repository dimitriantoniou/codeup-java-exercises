import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
/*
Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
He answers 'Whatever.' to anything else.
 */
        /*
.endsWith ?
.endsWith !
.equals empty

          */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Would you like to talk to Bob? (Y/N)");
        String userInput = scanner.next();
        boolean willTalk = userInput.equalsIgnoreCase("y");
        scanner.nextLine();
        if (willTalk) {
            do {
                System.out.println("What do you want to say?");
                String talkToBob = scanner.nextLine();

                if (talkToBob.endsWith("?")) {
                    System.out.println("Sure");
                } else if (talkToBob.endsWith("!")) {
                    System.out.println("Whoa, chill out!");
                } else if (talkToBob.equals("")) {
                    System.out.println("Fine, Be that way!");
                } else {
                    System.out.println("Whatever");
                }

                System.out.println("Keep chatting? (Y/N)");
                userInput = scanner.next();
                willTalk = userInput.equalsIgnoreCase("y");
                scanner.nextLine();
            } while (willTalk);
        }
    }
}