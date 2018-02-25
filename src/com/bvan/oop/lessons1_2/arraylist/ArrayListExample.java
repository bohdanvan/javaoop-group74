package com.bvan.oop.lessons1_2.arraylist;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 * @author bvanchuhov
 */
public class ArrayListExample {

    public static void main(String[] args) {
        // mutable
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages = new ArrayList<>();

        names.add("Taras");
        names.add("Ivan");
        names.add("Boris");

        System.out.println(names);
    }
}
