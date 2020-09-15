package Shapes;

public class Rectangle {

    protected double length;//protected property for length
    protected double width;//protected property for width

    public Rectangle(double length, double width){//define a constructor that accepts 2 numbers for length and width, set those properties
        this.length=length;
        this.width=width;
    }

    public double getArea(){    //create a getArea method
        return length*width;
    }

    public double getPerimeter(){    //create a getPerimeter method
        return 2*(length+width);
    }
}
