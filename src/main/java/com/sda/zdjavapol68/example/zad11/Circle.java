package com.sda.zdjavapol68.example.zad11;

public class Circle implements Movable, Resizable {

    private final Point2D center;
    private double radius;

    public Circle(Point2D center, Point2D point) {
        this.center = center;
        radius = Math.sqrt(Math.pow(center.getX() - point.getX(), 2) + Math.pow(center.getY() - point.getY(), 2));
    }

    public double getRadius(){
        return radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * getRadius();
    }

    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    @Override
    public void move(MoveDirection moveDirection) {
        center.move(moveDirection);
    }

    @Override
    public void resize(double resizeFactor) {
        radius *= resizeFactor;
    }
}
