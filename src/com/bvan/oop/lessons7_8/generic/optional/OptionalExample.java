package com.bvan.oop.lessons7_8.generic.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * @author bvanchuhov
 */
public class OptionalExample {

    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Kotlin", "JavaScript");
        Optional<String> s = findByFirstLetter(list, 'X');
        if (s.isPresent()) {
            System.out.println(s.get().length());
        }
    }

    private static Optional<String> findByFirstLetter(List<String> list, char ch) {
        for (String s : list) {
            if (!s.isEmpty() && s.charAt(0) == ch) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }

    /**
     * @return a string with specified letter in the beginning or null.
     */
    private static String findByFirstLetterOld(List<String> list, char ch) {
        for (String s : list) {
            if (!s.isEmpty() && s.charAt(0) == ch) {
                return s;
            }
        }
        return null;
    }
}
