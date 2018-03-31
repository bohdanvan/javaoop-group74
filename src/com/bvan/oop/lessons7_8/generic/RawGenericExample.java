package com.bvan.oop.lessons7_8.generic;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class RawGenericExample {

    public static void main(String[] args) {
        List names = new ArrayList(); // BAD PRACTICE, E = Object

        names.add("Taras");
        names.add("Vlad");
        names.add(10);
        names.add(LocalDateTime.now());

        names.get(0);

        System.out.println(names);
    }
}
