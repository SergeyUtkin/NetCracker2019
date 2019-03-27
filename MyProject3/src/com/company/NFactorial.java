package com.company;

public class NFactorial {
    private int factorial=1;
    boolean flag=true;
    public NFactorial(){
        int n = 5 + (int) (Math.random() * 10);
        System.out.println(n);
        long startTime = System.nanoTime();
        System.out.print(loop(n) +  " ");
        long estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);

        startTime = System.nanoTime();
        recursive(n);
        System.out.print(factorial + " ");
        estimatedTime = System.nanoTime() - startTime;
        System.out.println(estimatedTime);


    }
    public int loop(int n){
        int a=1;
        for (int i=1;i<n+1;i++){
            a=a*i;
        }
        return a;
    }
    public void recursive(int n){
            if(n!=1){
                if(flag)
                factorial=factorial*n;
                n--;
                recursive(n);}
            if(n==1) {
               flag=false;
            }


    }
}
