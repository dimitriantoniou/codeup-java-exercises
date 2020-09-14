package Shapes;

public class Square extends Rectangle {
    //define a constructor that accepts one argument, side
    //call parent constructor to set both length and width = side
    public Square(double side){
        length = side;
        width=side;
    }
    //override the getArea and getPerimeter methods with the following definitions for a square
    //perimeter = 4 x side
    //area = side ^ 2
}
