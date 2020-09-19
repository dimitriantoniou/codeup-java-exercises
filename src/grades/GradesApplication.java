package grades;

import java.util.HashMap;
import java.util.Scanner;

import util.Input;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student ryan = new Student("ryan");
        Student zach = new Student("zach");
        Student fer = new Student("fer");
        Student justin = new Student("justin");

        students.put("ryanorsinger", ryan);
        students.put("zgulde", zach);
        students.put("fmendozaro", fer);
        students.put("jreich5", justin);


        ryan.addGrade(90);
        ryan.addGrade(50);
        ryan.addGrade(100);
        zach.addGrade(100);
        zach.addGrade(100);
        zach.addGrade(100);
        fer.addGrade(60);
        fer.addGrade(70);
        fer.addGrade(100);
        justin.addGrade(80);
        justin.addGrade(50);
        justin.addGrade(70);

        /*
        System.out.println(ryan.getName()+ " grade average is "+ryan.getGradeAverage());
        System.out.println(zach.getName()+": grade average is "+zach.getGradeAverage());
        System.out.println(fer.getName()+": grade average is "+fer.getGradeAverage());
        System.out.println(justin.getName()+": grade average is "+justin.getGradeAverage());
        */


        boolean continueApplication = true;
        double gradeAverage = 0;

        while (continueApplication) {
            System.out.println("Welcome! Here are our student github usernames:");
            for (String key : students.keySet()) {
                System.out.println(key + " "); //Print the list of GitHub usernames out to the console,
            }
            System.out.println("What student would you like to select?"); //ask the user which student they would like to see more information about.

            Scanner sc = new Scanner(System.in);
            var userInput = sc.next(); // The user should enter a GitHub username
            //System.out.println("You have selected: "+userInput); //verifies variable was created
            while (!students.containsKey(userInput)) {
                System.out.println("Sorry, that user does not match. Please enter another username.");        // If the given input does not match up with a key in your map, tell the user that no users with that username were found.
                userInput = sc.next();
            }
            gradeAverage = students.get(userInput).getGradeAverage();        // If the given username does exist, display information about that student, including their name and their grades.
            System.out.printf("Student: %s | Grades: %s%n", userInput, gradeAverage);

            //After the information is displayed, the application should ask the user if they want to continue,
            // and keep running so long as the answer is yes.
            System.out.print("Would you like to search again? y/n");
            System.out.println("");
            Scanner scanner = new Scanner(System.in);
            if (scanner.next().equalsIgnoreCase("y")) {
                continueApplication = true;
            }else{
                continueApplication = false;
            }
            System.out.print("Thank you for accessing the grades portal!");
        }


    }
}
