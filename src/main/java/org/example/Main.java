package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("The code you are watching is a way for sorting array.");
        Integer[] a = new Integer[]{3, 3, 0,-78, 43, 43, 1, 2, 3, 4, 5, 8, 90, 43, 5, 6, 6};
        Integer[] a1 = new Integer[]{3, 0, 4, 1,9, 2, 4, 5, 8, 7, 6};
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i; j < a.length - 1; j++) {

                if (a[i] < a[j + 1]) {
                    continue;
                }
                if (a[i] >= a[j + 1]) {
                    int t=a[i];
                    a[i]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}