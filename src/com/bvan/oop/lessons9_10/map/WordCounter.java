package com.bvan.oop.lessons9_10.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class WordCounter {

    public static void main(String[] args) {
        List<String> langs = langs();
        Map<String, Integer> wordToCount = countWords(langs);
        Map<String, Integer> sortedWorToCount = new TreeMap<>(wordToCount);
        System.out.println(wordToCount);
        System.out.println(sortedWorToCount);

        List<Map.Entry<String, Integer>> sortedByCount = sortedByCount(wordToCount);
        System.out.println(sortedByCount);
    }

    public static List<Map.Entry<String, Integer>> sortedByCount(Map<String, Integer> wordToCount) {
        List<Map.Entry<String, Integer>> entries =
                new ArrayList<>(wordToCount.entrySet());
        entries.sort(new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return Integer.compare(o1.getValue(), o2.getValue());
            }
        }.reversed());
        return entries;
    }

    private static List<String> langs() {
        return Arrays.asList(
                "Java",
                "Haskell",
                "Java",
                "C#",
                "Ada",
                "Java",
                "Java",
                "Kotlin",
                "Kotlin",
                "Java",
                "Kotlin",
                "Haskell",
                "C#",
                "C#",
                "JavaScript",
                "Java",
                "JavaScript",
                "Haskell",
                "Kotlin",
                "Haskell",
                "Haskell"
        );
    }

    private static Map<String, Integer> countWords(
            List<String> words) {

        Map<String, Integer> wordToCount = new LinkedHashMap<>();
        for (String word : words) {
            if (wordToCount.containsKey(word)) {
                Integer count = wordToCount.get(word);
                wordToCount.put(word, count + 1);
            } else {
                wordToCount.put(word, 1);
            }
        }
        return wordToCount;
    }
}
