package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class AddLastElemTest {

    public static void main(String[] args) {
        int[] a = {10, 20};
        int[] res = ProcDynamicArrayAppV1.addLastElem(a, 30);
        System.out.println(Arrays.toString(res));
    }
}
