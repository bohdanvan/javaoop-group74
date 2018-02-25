package com.bvan.oop.lessons1_2.storing;

/**
 * @author bvanchuhov
 */
public class StringStoring2 {

    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = s1;

        s2.toUpperCase();

        System.out.println("s1 = " + s1); // Hello
        System.out.println("s2 = " + s2); // Hello
    }
}
