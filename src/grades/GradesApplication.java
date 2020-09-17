package grades;

import java.util.HashMap;

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

        /*
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
        */


        /*
        System.out.println(ryan.getName()+ " grade average is "+ryan.getGradeAverage());
        System.out.println(zach.getName()+": grade average is "+zach.getGradeAverage());
        System.out.println(fer.getName()+": grade average is "+fer.getGradeAverage());
        System.out.println(justin.getName()+": grade average is "+justin.getGradeAverage());
        */

        System.out.println(students);
    }
}
