package com.bvan.oop.lessons5_6.object;

import java.time.LocalDate;

/**
 * @author bvanchuhov
 */
public class ObjectExample {

    public static void main(String[] args) {
        Person p1 = new Person("Vlad");
        Person p2 = new Person("Vlad");
        System.out.println(p1.toString());

        System.out.println(p1 == p2); // false
        System.out.println(p1.equals(p2)); // true

        Object o1 = new Person("Ivan");
        Object o2 = "Hello";
        Object o3 = LocalDate.now();
    }
}

class Person extends Object {

    private final String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
