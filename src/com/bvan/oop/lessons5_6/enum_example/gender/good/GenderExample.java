package com.bvan.oop.lessons5_6.enum_example.gender.good;

/**
 * @author bvanchuhov
 */
public class GenderExample {

    public static void main(String[] args) {
        Gender gender = Gender.MALE;
        System.out.println(gender.name());
        System.out.println(gender.ordinal());
    }
}
