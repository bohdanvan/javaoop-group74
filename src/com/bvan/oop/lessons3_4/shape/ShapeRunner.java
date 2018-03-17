package com.bvan.oop.lessons3_4.shape;

import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ShapeRunner {

    public static void main(String[] args) {
        Rectangle r = new Rectangle(10, 20);
        Circle c = new Circle(10);

        System.out.println(r.getArea()); // 200
        System.out.println(c.getArea()); // 314

        Shape s1 = c;
        System.out.println(s1.getArea());

        ArrayList<Shape> shapes = new ArrayList<>();
//        shapes.add(new Rectangle(1, 2)); // 2
        shapes.add(new Circle(1)); // 3.14

        System.out.println("sumArea = " + getTotalArea(shapes));

        Shape shape = shapes.get(0);
        if (shape instanceof Rectangle) { // BAD PRACTICE
            Rectangle rectangle = (Rectangle) shape; // BAD PRACTICE
            System.out.println(rectangle.getWidth());
        }
    }

    private static double getTotalArea(ArrayList<Shape> shapes) {
        double sumArea = 0.0;
        for (Shape shape : shapes) {
            sumArea += shape.getArea();
        }
        return sumArea;
    }
}
