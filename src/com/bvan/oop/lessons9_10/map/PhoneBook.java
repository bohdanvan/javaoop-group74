package com.bvan.oop.lessons9_10.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author bvanchuhov
 */
public class PhoneBook {

    public static void main(String[] args) {
        Map<String, PhoneNumber> phoneBook = new TreeMap<>();

        phoneBook.put("Masha", new PhoneNumber("+380951111112"));
        phoneBook.put("Vasya", new PhoneNumber("+380951111111")); // O(1)
        phoneBook.put("Ilya", new PhoneNumber("+380951111113"));

        PhoneNumber prevNumber = phoneBook.put("Ilya", new PhoneNumber("+380951111115"));// O(1)
        System.out.println(prevNumber);

//        phoneBook.remove("Ilya"); // O(1)

        PhoneNumber number = phoneBook.get("Ilya");
        System.out.println(number);

        System.out.println("--------");

        Set<String> names = phoneBook.keySet();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println();

        Collection<PhoneNumber> phoneNumbers = phoneBook.values();
        for (PhoneNumber phoneNumber : phoneNumbers) {
            System.out.println(phoneNumber);
        }
        System.out.println();

        Set<Map.Entry<String, PhoneNumber>> entries = phoneBook.entrySet();
        for (Map.Entry<String, PhoneNumber> entry : entries) {
            String name = entry.getKey();
            PhoneNumber phoneNumber = entry.getValue();
            System.out.println(name + " -> " + phoneNumber);
        }
    }
}

