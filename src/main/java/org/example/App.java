package org.example;

public class App {
    public static void main(String[] args) {
        Shape Circle = new Circle(5);
        Circle.calculateArea();

        Shape Rectangle = new Rectangle(5, 6);
        Rectangle.calculateArea();

        Shape Triangle = new Triangle(5, 4);
        Triangle.calculateArea();
    }
}
