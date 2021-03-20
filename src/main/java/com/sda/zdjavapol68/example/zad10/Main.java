package com.sda.zdjavapol68.example.zad10;

public class Main {
    public static void main(String[] args) {
        Point2D center = new Point2D(0.0, 0.0);
        Point2D point = new Point2D(1.0, 0.0);

        Circle circle = new Circle(center, point);
        System.out.println("radius: " + circle.getRadius());
        System.out.println("perimeter: " + circle.getPerimeter());
        System.out.println("area: " + circle.getArea());

        circle.move(new MoveDirection(10.5, -3.0));
        //debug to see inner field values
        //alternatively add getter methods and print them on stdout

        System.out.println(center);
    }
}
