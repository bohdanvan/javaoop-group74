package com.bvan.oop.lessons5_6.enum_example.gender.bad;

/**
 * @author bvanchuhov
 */
public class BadUserRunner {

    public static void main(String[] args) {
        BadUser user = new BadUser("Taras", 25, BadUser.MALE);
        String genderName = user.getGenderName();
        System.out.println(genderName);
    }
}
