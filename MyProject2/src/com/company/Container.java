package com.company;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1 + width;
        this.y2 = y1 + height;
    }

    public int getHeight() {
        return y2 - y1;
    }

    public int getWidth() {
        return x2 - x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX1() {
        return x1;
    }

    public int getY2() {
        return y2;
    }

    public int getX2() {
        return x2;
    }

    public boolean collides(Ball ball) {
        boolean a = true;
        if ((ball.getX() - ball.getRadius()) < x1 || (ball.getX() + ball.getRadius()) > x2 || (ball.getY() - ball.getRadius()) < y1 || (ball.getY() + ball.getRadius()) > y2) {
            a = false;
        }
        return a;
    }

    @Override
    public String toString() {
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + x1;
        result = 31 * result + y1;
        result = 31 * result + x2;
        result = 31 * result + y2;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj.getClass() != this.getClass()) return false;
        Container cont = (Container) obj;
        return cont.getX1() == x1 && cont.getY1() == y1 && cont.getX2()==x2 && cont.getY2()==y2;

    }
}
