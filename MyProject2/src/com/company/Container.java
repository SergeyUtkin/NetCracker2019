package com.company;

public class Container {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Container(int x1, int y1, int width, int height) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x1+width;
        this.y2 = y1+height;
    }

    public int getHeight() {
        return y2-y1;
    }

    public int getWidth() {
        return x2-x1;
    }

    public int getY1() {
        return y1;
    }

    public int getX1() {
        return x1;
    }
    public boolean collides(Ball ball){
        boolean a=true;
        if((ball.getX()-ball.getRadius())<x1 || (ball.getX()+ball.getRadius())>x2 || (ball.getY()-ball.getRadius())<y1 || (ball.getY()+ball.getRadius())>y2){
            a=false;
        }
        return a;
    }
    @Override
    public String toString(){
        return "Container[(" + x1 + "," + y1 + "),(" + x2 + "," + y2 + ")]";
    }
}
