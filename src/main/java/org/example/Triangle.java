package org.example;

public class Triangle implements Shape {
    public int base;
    public int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь треугольника равна " + (base * height)*0.5);
    }
}
