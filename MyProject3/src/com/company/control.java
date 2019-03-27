package com.company;

public class Control {
    int a=1,b=3,c=5,d=7,e=9;
    enum Numbers {a,b,c,d,e};
    public Control() {

        long startTime = System.nanoTime();
        ifelse();
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println("operating time " + estimatedTime);
        startTime = System.nanoTime();
        switchcase();
        estimatedTime = System.nanoTime() - startTime;
        System.out.println("operating time " + estimatedTime);
    }

    public void ifelse() {
        Numbers num;
        num=Numbers.d;


        if(num==Numbers.a){
            System.out.println(a);
        }
        else
            {if(num==Numbers.b){
                System.out.println(b);
            }
            else{
                if(num==Numbers.c){
                    System.out.println(c);
                }
                else{
                    if(num==Numbers.d){
                        System.out.println(d);
                    }
                    else {
                        if(num==Numbers.e){
                            System.out.println(e);}
                            else {
                            System.out.println("miss");
                        }
                        }
                    }
                }

            }
        }

        public void switchcase(){
            Numbers num;
            num=Numbers.d;

            switch (num) {
                case a:
                    System.out.println(a);
                    break;
                case b:
                    System.out.println(b);
                    break;
                case c:
                    System.out.println(c);
                    break;
                case d:
                    System.out.println(d);
                    break;
                case e:
                    System.out.println(e);
                    break;
            }
        }
    }

