package com.company;

public class nested_loops {
    public nested_loops(){
        rectangle(5,5);
        System.out.println();
        trangle1(5,5);
        System.out.println();
        trangle2(5,5);
        System.out.println();
        trangle3(5,5);
        System.out.println();
        trangle4(5,5);
    }
    public void rectangle(int lenght,int width){
        for(int i=0;i<lenght;i++){
            for (int j=0;j<width;j++)
                System.out.print("# ");
        System.out.println();}

    }
    public void trangle1(int lenght,int width){
        for(int i=1;i<lenght+1;i++){
            for (int j=1;j<i+1;j++)
                System.out.print("# ");
            System.out.println();}
    }

    public void trangle2(int lenght,int width){
        for(int i=1;i<lenght+1;i++){
            for (int j=0;j<lenght-i+1;j++)
                System.out.print("# ");
            System.out.println();}
    }
    public void trangle3(int lenght,int width){
        for(int i=0;i<lenght+1;i++){
            for (int j=0;j<i+1;j++)
                System.out.print("  ");
            for (int c=i+1;c<width+1;c++)
                System.out.print("# ");
            System.out.println();}
    }
    public void trangle4(int lenght,int width){
        for(int i=0;i<lenght+1;i++){
            for (int j=0;j<lenght-i+1;j++)
                System.out.print("  ");
            for (int c=lenght-i+1;c<width+1;c++)
                System.out.print("# ");
            System.out.println();}
    }
}
