package com.bvan.oop.lessons3_4;

/**
 * @author bvanchuhov
 */
public class SumExample {

    public static void main(String[] args) {
        int x = sum(10, 20);
        System.out.println(x);

        System.out.println(Math.min(10, 20));
    }

    private static int sum(int a, int b) {
        return a + b;
    }
}
