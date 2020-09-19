package grades;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private String name;
    private ArrayList<Integer> grades;
    private HashMap<String,String>attendance;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
        this.attendance=new HashMap<>();
    }

    public String getName() {
        System.out.println(name);
        return name;
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public double getGradeAverage() {
        int sum = 0;
        for (int i = 0; i < grades.size(); i++) {
            sum += grades.get(i);
        }
        int average = sum / grades.size();
        return average;
    }

    public void recordAttendance(String date, String value){

    }

    public static void main(String[] args) {
        Student dimitri = new Student("Dimitri");
        dimitri.addGrade(90);
        dimitri.addGrade(80);
        dimitri.addGrade(70);
        System.out.println("Dimitri's grade average is " + dimitri.getGradeAverage());

    }
}
