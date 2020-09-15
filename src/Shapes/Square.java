package Shapes;

public class Square extends Rectangle {

    public Square (double side){    //define a constructor that accepts one argument, side
        super(side,side);    //call parent constructor to set both length and width = side
    }

    //override the getArea and getPerimeter methods with the following definitions for a square
    public double getArea(){    //area = side ^ 2
        return super.width*super.width;
    }

    public double getPerimeter(){   //perimeter = 4 x side
        return 4*super.width;
    }

}
