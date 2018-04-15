package com.bvan.oop.lessons9_10.map;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class TreeMapExample {

    public static void main(String[] args) {
        SortedMap<String, PhoneNumber> phoneBook = new TreeMap<>();

        phoneBook.put("Artem", new PhoneNumber("+380951111112"));
        phoneBook.put("Bohdan", new PhoneNumber("+380951111115")); // O(1)
        phoneBook.put("Ilya", new PhoneNumber("+380951111113"));
        phoneBook.put("Boris", new PhoneNumber("+380951111111")); // O(1)

        PhoneNumber number = phoneBook.get("Ilya");// O(log2N)
        System.out.println(number);

        System.out.println(phoneBook.keySet());

        System.out.println(phoneBook.lastKey());
        System.out.println(phoneBook.firstKey());

        SortedMap<String, PhoneNumber> recordsStartedWithB = phoneBook.subMap("B", "C");
        System.out.println(recordsStartedWithB);

        System.out.println(phoneBook.headMap("C"));
        System.out.println(phoneBook.tailMap("C"));
    }
}
