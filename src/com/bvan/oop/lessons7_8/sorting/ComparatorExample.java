package com.bvan.oop.lessons7_8.sorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author bvanchuhov
 */
public class ComparatorExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList(
                "Boris",
                "Zoe",
                "Bob",
                "Alexander",
                "Sophia");

        names.sort(lengthComparator().reversed()
                .thenComparing(firstLetterComparator()));

        System.out.println(names);
    }

    public static Comparator<String> lengthComparator() {
        return new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return Integer.compare(a.length(), b.length());
            }
        };
    }

    public static Comparator<String> firstLetterComparator() {
        return new FirstLetterComparator();
    }
}

class LengthComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        return Integer.compare(a.length(), b.length());
    }
}

class FirstLetterComparator implements Comparator<String> {

    @Override
    public int compare(String a, String b) {
        if (a.isEmpty() && b.isEmpty()) return 0;
        if (a.isEmpty()) return -1;
        if (b.isEmpty()) return 1;
        return Character.compare(a.charAt(0), b.charAt(0));
    }
}