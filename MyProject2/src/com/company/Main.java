package com.company;

public class Main {

    public static void main(String[] args) {
     Ball ball=new Ball(56,16,5,16,153);
        System.out.println(ball.toString());
        Container cont=new Container(50,0,100,100);
        System.out.println(cont.toString());
        System.out.println(cont.collides(ball));
        ball.move();
        System.out.println(ball.toString());
        System.out.println(cont.collides(ball));
	// write your code here
    }
}











