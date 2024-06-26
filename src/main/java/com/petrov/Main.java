package com.petrov;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Circle Area: " + Round.round((float) circle.calculateArea()));
        System.out.println("Circle Perimeter: " + Round.round((float)circle.calculatePerimeter()));

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Perimeter: " + rectangle.calculatePerimeter());

        Triangle triangle = new Triangle(3, 4, 5);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Perimeter: " + triangle.calculatePerimeter());

    }
}