package com.bvan.oop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ComparableSortingExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10, 5, 7, 20);
        Collections.sort(list);
        System.out.println(list);
    }
}
