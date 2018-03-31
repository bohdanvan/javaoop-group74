package com.bvan.oop.lessons7_8.wrapper;

/**
 * @author bvanchuhov
 */
public class StringPool {

    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        String part = "Ja";

        System.out.println(s1 == s2);
        System.out.println(s1 == "Java");
        System.out.println(s1 == (part + "va").intern());
    }
}
