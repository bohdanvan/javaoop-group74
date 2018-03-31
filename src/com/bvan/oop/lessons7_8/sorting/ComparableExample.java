package com.bvan.oop.lessons7_8.sorting;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class ComparableExample {

    public static void main(String[] args) {
        System.out.println("ABCD".compareTo("EFG")); // <0
        System.out.println("Hometown".compareTo("Homework")); // <0
        System.out.println("Homework".compareTo("Home")); // >0
        System.out.println("A".compareTo("a")); // <0

        LocalDate d1 = LocalDate.of(1995, 8, 4);
        LocalDate d2 = LocalDate.of(1990, 10, 3);
        System.out.println(d1.compareTo(d2)); // >0
    }
}
