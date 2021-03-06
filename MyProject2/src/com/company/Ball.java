package com.company;

public class Ball {
    private float x;
    private float y;
    private int radius;
    private float xDelta;
    private float yDelta;

    public Ball(float x, float y, int radius, float speed, int direction) {
        this.x = x;
        this.y = y;
        this.radius = radius;
        if (-180 < direction && direction < 180) {
            xDelta = speed * (float) (Math.cos(direction));
            yDelta = speed * (float) (Math.sin(direction));
        }

    }

    public void setyDelta(float yDelta) {
        this.yDelta = yDelta;
    }

    public void setxDelta(float xDelta) {
        this.xDelta = xDelta;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getyDelta() {
        return yDelta;
    }

    public float getxDelta() {
        return xDelta;
    }

    public int getRadius() {
        return radius;
    }

    public float getY() {
        return y;
    }

    public float getX() {
        return x;
    }

    public void move() {
        x = x + xDelta;
        y = y + yDelta;
    }

    public void reflectHorizontal() {
        xDelta = -xDelta;
    }

    public void reflectVertical() {
        yDelta = -yDelta;
    }

    @Override
    public String toString() {
        return "Ball[(" + x + "," + y + "),speed=(" + xDelta + "," + yDelta + ")]";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null) return false;
        if (obj.getClass() != this.getClass()) return false;
        Ball ball = (Ball) obj;
        return ball.getX() == x && ball.getY() == y && ball.getRadius() == radius && ball.getxDelta() == xDelta && ball.getyDelta() == yDelta;
    }

    @Override
    public int hashCode() {
        int result = 13;
        result = 31 * result + Float.floatToIntBits(x);
        result = 31 * result + Float.floatToIntBits(y);
        result = 31 * result + radius;
        result = 31 * result + Float.floatToIntBits(xDelta);
        result = 31 * result + Float.floatToIntBits(yDelta);
        return result;
    }
}
