package com.company;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public  int[] getXY(){
        int[] arr={x,y};
        return arr;
    }
    public  void setXY(int x,int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString(){
        String a="(" + x + "," + y + ")";
        return a;
    }
    public double distance(){
        return Math.sqrt(x*x+y*y);
    }
    public double distance(int x,int y){
        return  Math.sqrt((this.x-x)*(this.x-x)+(this.y-y)*(this.y-y) );
    }
    public  double distance(MyPoint point){
        return  Math.sqrt((point.getX()-x)*(point.getX()-x) + (point.getY()-y)* (point.getY()-y));
    }
}
