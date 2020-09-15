package Shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getArea() {    //create a getArea method
        return length * width;
    }

    public double getPerimeter() {    //create a getPerimeter method
        return 2 * (length + width);
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;

    }
}