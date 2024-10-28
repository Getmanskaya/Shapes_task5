package org.example;

public class Rectangle implements Shape {
    public int length ;
    public int width ;

    public Rectangle(int length , int width ) {
        this.length  = length ;
        this.width  = width ;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь прямоугольника равна " + (length * width));
    }
}
