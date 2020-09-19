package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
    public static void main(String[] args){
        HashMap<String, Student> students = new HashMap<>();

        Student ryan = new Student ("ryan");
        Student zach=new Student("zach");
        Student fer=new Student("fer");
        Student justin =new Student("justin");

        students.put("ryanorsinger",ryan);
        students.put("zgulde",zach);
        students.put("fmendozaro",fer);
        students.put("jreich5",justin);


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

        //Print the list of GitHub usernames out to the console,
        //ask the user which student they would like to see more information about.
        // The user should enter a GitHub username (i.e. one of the keys in your map).
        // If the given input does not match up with a key in your map, tell the user that no users with that username were found.
        // If the given username does exist, display information about that student, including their name and their grades.
        //After the information is displayed, the application should ask the user if they want to continue,
        // and keep running so long as the answer is yes.

        boolean continueApplication = true;

        //while (continueApplication){
            System.out.println("Welcome! Here are our student github usernames:");
        for (String key: students.keySet()){
            System.out.println(key + " ");
        }

    }
        //}
     //   continueApplication = Input.yesNo("Would you like to search again? (y/n)");

    }
