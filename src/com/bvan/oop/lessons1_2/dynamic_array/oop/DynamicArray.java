package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class DynamicArray {

    // fields (data)
    int size = 0;
    int[] elems;

    public DynamicArray(int initCapacity) {
        elems = new int[initCapacity];
    }

    public DynamicArray() {
        elems = new int[4];
    }

    // interface

    public void addLast(int n) {
        // implementation
        if (size == elems.length) {
            elems = Arrays.copyOf(elems, elems.length * 2);
        }
        elems[size] = n;
        size++;
    }

    public String toString() {
        // implementation
        return Arrays.toString(Arrays.copyOf(elems, size));
    }
}
