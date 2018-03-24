package com.bvan.oop.lessons5_6.exception.factorial;

import java.math.BigInteger;

/**
 * @author bvanchuhov
 */
public class FactorialRunner {

    public static void main(String[] args) {
        try {
            BigInteger factorial = Factorial.factorial(1);
            System.out.println(factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Sorry, error: " + e.getMessage());
        } finally {
            System.out.println("Finally");
        }

        System.out.println("Goodbye");
    }
}
