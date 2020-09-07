import java.util.Scanner;

public class Bob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Continue? [y/n]");
        String continueTalking = sc.next();
        boolean userTalk = continueTalking.equalsIgnoreCase("y");
        sc.nextLine();
        if (userTalk) {
            do {
                System.out.println("What would you like to say to Bob?");
                String saidToBob = sc.nextLine();

                if (saidToBob.endsWith("?")){
                    System.out.println("Sure.");
                }else if (saidToBob.endsWith("!")){
                    System.out.println("Woah, chill out!");
                }else if (saidToBob.equals("")){
                    System.out.println("Fine. Be that way!");
                }else{
                    System.out.println("Whatever.");
                }

                System.out.println("Continue talking to Bob? [y/n]");
                continueTalking = sc.next();
                userTalk = continueTalking.equalsIgnoreCase("y");
                sc.nextLine();
            } while (userTalk);

        }
    }
}
