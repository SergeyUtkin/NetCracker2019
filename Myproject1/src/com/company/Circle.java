package com.company;

public class Circle {
    private double radius = 1.0;
    private String color = "red";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        String a = "Circle[radius = " + this.radius + " , " + "color= " + this.color + " ]";
        return a;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + (int) (Double.doubleToLongBits(radius) ^ (Double.doubleToLongBits(radius) >>> 32));
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Circle circle = (Circle) obj;
        return circle.getColor().equals(color) && circle.getRadius() == radius;

    }
}
