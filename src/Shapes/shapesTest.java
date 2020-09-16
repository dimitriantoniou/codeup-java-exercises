package Shapes;

public class shapesTest {
    public static void main(String[] args){
        //create a variable of the type Rectangle named box1 and assign it a new instance of the Rectangle class with a width of 4 and a length of 5
        //verify that the getPerimeter and getArea methods return 18 and 20, respectively.
        //create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
        //verify that the getPerimeter and getArea methods return 20 and 25, respectively.
        Measurable myShape;
        Measurable myShape2;

        myShape = new Square(2);
        myShape2= new Rectangle(2,4);

        System.out.println("Square has an area of " + myShape.getArea());
        System.out.println("Square has a perimeter of "+myShape.getPerimeter());
        System.out.println("Rectangle has an area of "+myShape2.getArea());
        System.out.println("Rectangle has a perimeter of "+myShape2.getPerimeter());

        /*
        //tests from inheritance and polymorphism
        Rectangle box1 = new Rectangle(4,5);
        System.out.print(box1.getPerimeter());
        System.out.print(box1.getArea());

        Rectangle box2 = new Square(5);
        System.out.print(box2.getPerimeter());
        System.out.print(box2.getArea());
         */
    }
}
