package com.company;

import java.util.Arrays;
import java.util.Random;

public class MultidimensionalArray {
    public MultidimensionalArray() {
        sum();
        max();
        maxModule();
        sort();
    }

    public void sum() {
        int sum = 0, sum1 = 0;
        long mul = 1, mul1 = 1;
        Random rnd = new Random();
        int[][] arr = new int[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                arr[i][j] = (rnd.nextInt(99) + 1);
                //System.out.print(arr[i][j] + " ");
                if (j == i) {
                    sum = sum + arr[i][j];
                    mul = mul * arr[i][j];
                }
                if (j == 7 - i) {
                    sum1 = sum1 + arr[i][j];
                    mul1 = mul1 * arr[i][j];
                }
            }
            System.out.println();
        }
        System.out.println(sum + " ," + mul + " ," + sum1 + " ," + mul1);
        System.out.println();
    }

    public void max() {
        Random rnd = new Random();
        int max = 0, xCount = 0, yCount = 0;
        int[][] arr = new int[8][5];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (rnd.nextInt(199) + -99);
                if (max < arr[i][j]) {
                    max = arr[i][j];
                    xCount = j;
                    yCount = i;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("Max = " + max + " indexes - (" + yCount + "," + xCount + ")");
    }

    public void maxModule() {
        Random rnd = new Random();
        int maxModule = Integer.MIN_VALUE, xCount = 0;
        int[][] arr = new int[8][6];
        for (int i = 0; i < 8; i++) {
            arr[i][5] = 1;
            for (int j = 0; j < 5; j++) {
                arr[i][j] = (rnd.nextInt(21) + -10);
                arr[i][5] = arr[i][5] * arr[i][j];

            }
            if (maxModule < Math.abs(arr[i][5])) {
                maxModule = arr[i][5];
                xCount = i;
            }

        }
        for (int i = 0; i < 8; i++) {
            if (Math.abs(arr[i][5]) == maxModule) {
                for (int j = 0; j < 5; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();

    }

    public void sort() {
        Random rnd = new Random();
        int max = 0, xCount = 0, yCount = 0;
        int[][] arr = new int[10][7];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 7; j++) {
                arr[i][j] = (rnd.nextInt(101));
                System.out.print(arr[i][j] + " ");
            }




            System.out.println();
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < 10; i++) {
            Arrays.sort(arr[i]);
            for (int j = 0; j < 7; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
