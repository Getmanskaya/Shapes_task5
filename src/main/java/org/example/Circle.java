package org.example;

public class Circle implements Shape {
    public int r;

    public Circle(int r) {
        this.r = r;
    }

    @Override
    public void calculateArea() {
        System.out.println("Площадь круга равна " + Math.round(r * r * Math.PI));
    }
}

