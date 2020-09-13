package com.company;

public class Circle {
    double radius, perimetr, square;
    Circle(double r){
        this.radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getSquare() {
        square = Math.PI*Math.pow(this.radius, 2);
        return square;
    }

    public double getPerimetr() {
        perimetr = 2*Math.PI*radius;
        return perimetr;
    }
}
