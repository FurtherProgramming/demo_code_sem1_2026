package week05;

import javax.sound.sampled.Line;

public class AbstractClassDemo {
    public static void printArea(Shape shape){
        System.out.println(shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle myShape1 = new Rectangle(10.0, 5.0);
        Circle myShape2 = new Circle();

        myShape1.print();

        printArea(myShape1);
        printArea(myShape2);
    }
}
