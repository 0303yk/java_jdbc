package com.oracle.day02;

public class Demo11 {
    public static void main(String[] args) {
        int[] a = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int x = 0;
        for (int i = 1; i < a.length - 1; i++) {
            if (a[i] < a[i + 1]) {
                x = a[i + 1];
            }
        }
        System.out.println("元组中最大数为" + x);
    }
}

