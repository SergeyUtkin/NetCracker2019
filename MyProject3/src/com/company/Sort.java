package com.company;

import java.util.Arrays;

public class Sort {

    public Sort(){
    int n = 5 + (int) (Math.random() * 10);
    int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
        array[i] = 1 + (int) (Math.random() * 100);
    }
        for (int i = 0; i < array.length; i++) {
        System.out.print(array[i] + " ");
    }
        System.out.println();
    int[] arr;
    long startTime = System.nanoTime();
    arr = bubble(array);
    long estimatedTime = System.nanoTime() - startTime;


        for (int i = 0; i < array.length; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println(estimatedTime);


    startTime = System.nanoTime();
    arr = select(array);
    estimatedTime = System.nanoTime() - startTime;

        for (int i = 0; i < array.length; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println(estimatedTime);
    startTime = System.nanoTime();
    arr = sorting(array);
    estimatedTime = System.nanoTime() - startTime;


        for (int i = 0; i < array.length; i++) {
        System.out.print(arr[i] + " ");
    }
        System.out.println(estimatedTime);}

    public int[] bubble(int[] array) {
        for (int i = 0; i < array.length; i++)
            for (int j = i; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }

        return array;
    }

    public int[] select(int[] array) {
        int min = 200;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            min = 200;
            count = i;
            for (int j = i; j < array.length; j++)
                if (array[j] < min) {
                    min = array[j];
                    count = j;
                }
            int temp = array[count];
            array[i] = array[count];
            array[count] = array[i];
        }

        return array;
    }

    public int[] sorting(int[] array) {
        Arrays.sort(array);

        return array;
    }
}
