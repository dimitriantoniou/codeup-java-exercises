package Shapes;
import util.Input;

public class Circle {
        private double radius;
        public Circle(){
            radius = Input.getDouble();
            System.out.println("The radius is: " + getArea());
            System.out.println("The circumference is "+ getCircumference());
            new Circle();
        }
        public double getArea(){
            return Math.PI*radius*radius;
        }
        public double getCircumference(){
            return Math.PI*2*radius;
        }
    }
