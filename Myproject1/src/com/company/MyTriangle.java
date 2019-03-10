package com.company;

public class MyTriangle {
    private MyPoint v1;
    private MyPoint v2;
    private MyPoint v3;

    public MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3) {
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
    }

    public MyTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        v1 = new MyPoint(x1, y1);
        v2 = new MyPoint(x2, y2);
        v3 = new MyPoint(x3, y3);
    }



    public double getPerimeter(){
        double a=v1.distance(v2) + v2.distance(v3) + v3.distance(v1);
        return a;
    }
    public String getType(){
        double a=v1.distance(v2);
        double b=v2.distance(v3);
        double c=v3.distance(v1);
        String type=null;

        if(a>b && a>c){
            if(b>c)
            type= testing(a,b,c);
            else
                type= testing(a,c,b);
        }
        if(a>b && a<c){
            type= testing(c,a,b);
        }
        if(a<b && a>c){
            type= testing(b,a,c);
        }
        if(a<b && a<c){
            if(b<c)
                type= testing(c,b,a);
            else
                type= testing(b,c,a);
        }
        return type;

    }

    private String testing(double a,double b,double c){
        String type=null;
        if(a*a>b*b + c*c){
            type="obtuse triangle";
        }
        if(a*a == b*b + c*c){
            type= "right triangle";
        }
        if(a*a<b*b + c*c){
            type=  "acute triangle";
        }
        return type;
    }
    @Override
    public String toString() {
        String a = "MyTriangle[v1=" + v1.toString() + ", v2=" + v2.toString() + ", v3=" + v3.toString() + "]";
        return a;
    }

}