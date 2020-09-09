package Shapes;
import util.Input;

public class Circle {
        private double radius;
        public Circle(){
            radius = Input.getDouble();//need to finish the input method from previous lesson
        }
        public double getArea(){
            return Math.PI*radius*radius;
        }
        public double getCircumference(){
            return Math.PI*2*radius;
        }

    }
/*
public class Circle {
    private double radius;

    public Circle(){
        radius = Input.getDouble();
        System.out.println("radius = " + this.radius);
        System.out.println("getArea() = "+ getArea());
        System.out.printf("Your circumference = " + getCircumference() +"%n");
    }

}
*/