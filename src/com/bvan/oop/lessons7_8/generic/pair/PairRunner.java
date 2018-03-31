package com.bvan.oop.lessons7_8.generic.pair;

import java.util.List;

/**
 * @author bvanchuhov
 */
public class PairRunner {

    public static void main(String[] args) {
        Pair<String, Integer> nameAndAge =
                new Pair<>("Vlad", 30);
        Integer name = nameAndAge.getRight();

        Pair<String, String> nameAndSurname =
                new Pair<>("Vlad", "Ivanov");
        String surname = nameAndSurname.getRight();

        Pair<List<String>, Pair<String, Integer>> x;

        List<List<List<String>>> y;
    }
}
