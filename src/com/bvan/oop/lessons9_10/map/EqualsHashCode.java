package com.bvan.oop.lessons9_10.map;

import java.util.Objects;

/**
 * @author bvanchuhov
 */
public class EqualsHashCode {

    public static void main(String[] args) {
        A a = new A("Java");
        A b = new A("Java");
        A c = new A("Kotlin");

        System.out.println("Equals:");
        System.out.println(a.equals(a)); // true
        System.out.println(a.equals(b)); // true
        System.out.println(b.equals(a)); // true
        System.out.println(a.equals(c)); // false
        System.out.println(Objects.equals(a, c)); // false
        System.out.println();

        System.out.println("HashCode:");
        System.out.println(a.hashCode() == a.hashCode()); // true
        System.out.println(a.hashCode() == b.hashCode()); // true
        System.out.println(a.hashCode() == c.hashCode()); // false, but could be true

        System.out.println(a.hashCode());
        System.out.println(c.hashCode());
    }
}

class A {

    private final String x;
    private final int y = 10;

    public A(String x) {
        this.x = x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        A a = (A) o;

        if (y != a.y) return false;
        return x != null ? x.equals(a.x) : a.x == null;
    }

    @Override
    public int hashCode() {
        int result = x != null ? x.hashCode() : 0;
        result = 31 * result + y;
        return result;
    }
}
