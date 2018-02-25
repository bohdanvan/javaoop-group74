package com.bvan.oop.lessons1_2.dynamic_array.oop;

/**
 * @author bvanchuhov
 */
public class DynamicArrayTest {

    public static void main(String[] args) {
        DynamicArray a1 = new DynamicArray();
        a1.addLast(10);
        a1.addLast(20);
        a1.addLast(30);
        System.out.println(a1.toString()); // [10, 20, 30]

        DynamicArray a2 = new DynamicArray(10);
        a2.addLast(10);
        a2.addLast(20);
        a2.addLast(30);
        a2.addLast(40);
        a2.addLast(50);
        a2.addLast(60);
        System.out.println(a2.toString()); // [10, 20, 30, 40, 50, 60]
    }
}
