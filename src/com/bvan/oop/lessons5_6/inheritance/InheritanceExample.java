package com.bvan.oop.lessons5_6.inheritance;

/**
 * @author bvanchuhov
 */
public class InheritanceExample {

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.sayHello();

        Person p2 = new Person("Vlad", 30);
        p2.sayHello();

        Developer dev1 = new Developer("Ivan", 25, "Amazon");
        dev1.sayHello();
        dev1.writeCode();

        Person p3 = new Developer("Irina", 27, "Google");
        p3.sayHello();
    }
}

class Person {

    private final String name;
    private final int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this("unnamed", 0);
    }

    protected String getName() {
        return name;
    }

    public void sayHello() {
        System.out.println("Hello, I'm " + name);
    }
}

class Developer extends Person {

    private final String company;

    public Developer(String name, int age, String company) {
        super(name, age);
        this.company = company;
    }

    public void writeCode() {
        System.out.println("I write code in " + company);
    }

    @Override
    public void sayHello() {
        super.sayHello();
        System.out.println("I'm " + getName() + " from " + company);
    }
}