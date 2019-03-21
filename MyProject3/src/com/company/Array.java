package com.company;

import javax.sound.midi.Soundbank;
import java.util.Arrays;
import java.util.Random;

public class Array {
    public Array() {
        odd();
        System.out.println();
        rand();
        System.out.println();
        maxMin();
        System.out.println();
        average();
        System.out.println();
        count();
    }

    public void odd() {
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) {
            arr[i] = 1 + i * 2;
        }
        for (int i = 0; i < 50; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 49; i > -1; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public void rand() {

        int[] arr = new int[20];
        int a = 0, b = 0;
        for (int i = 0; i < 20; i++) {
            arr[i] = (int) (Math.random() * 10);
            System.out.print(arr[i] + " ");
            if (arr[i] % 2 == 0)
                a++;
            else
                b++;
        }
        System.out.println();
        System.out.println("even- " + a + ", odd- " + b);
    }

    public void maxMin() {
        Random rnd = new Random();
        int max = -100, min = 100, idMin = 0, idMax = 0;
        int[] arr = new int[15];

        int a = -50;
        int b = 50;
        int diff = b - a;
        for (int i = 0; i < 15; i++) {
            arr[i] = rnd.nextInt(diff + 1) + a;
            if (min >= arr[i]) {
                min = arr[i];
                idMin = i;
            }
            if (max < arr[i]) {
                max = arr[i];
                idMax = i;
            }

        }
        for (int i = 0; i < 15; i++)
            System.out.print(arr[i] + " ");
        System.out.println(" Max = " + max + " with index " + idMax + " ,Min = " + min + " with index " + idMin);
    }

    public void average() {
        double average1 = 0;
        double average2 = 0;
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + " ");
            average1 = average1 + arr1[i];
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            arr1[i] = (int) (Math.random() * 10);
            System.out.print(arr1[i] + " ");
            average2 = average2 + arr1[i];
        }
        System.out.println("Average1 = " + average1 / 10 + ",Average2 = " + average2 / 10);

        if (average1 == average2)
            System.out.println("The averages are the same");
        else if (average1 > average2)
            System.out.println("The average value of the first is greater");
        else
            System.out.println("The average value of the second is greater");
    }

    public void count() {
        Random rnd = new Random();
        int a = -1, b = 1, max = 0, count = 0;
        int diff = b - a;
        int[] arr = new int[20];
        int[] array = new int[3];
        for (int i = 0; i < 20; i++) {
            arr[i] = arr[i] = rnd.nextInt(diff + 1) + a;
            System.out.print(arr[i] + " ");
            if (arr[i] == -1)
                array[0]++;
            if (arr[i] == 0)
                array[1]++;
            if (arr[i] == 1)
                array[2]++;
        }
        for (int i = 0; i < 3; i++) {
            if (max < array[i]) {
                count = i;
                max = array[i];
            }
        }
        System.out.print("most common = " + (count - 1) + " ");

        for (int i = 0; i < 3; i++) {
            if (max == array[i] && i != count) {
                System.out.println("and " + (i - 1));
            }
        }
        System.out.println();


    }
}
