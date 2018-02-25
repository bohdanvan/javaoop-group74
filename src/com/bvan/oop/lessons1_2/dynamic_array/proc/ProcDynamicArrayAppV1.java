package com.bvan.oop.lessons1_2.dynamic_array.proc;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class ProcDynamicArrayAppV1 {

    public static void main(String[] args) {
        // Ctrl + Alt + V
        int[] elems = readClientElemsFromConsole();

        System.out.println(Arrays.toString(elems));
        System.out.println("sum = " + sum(elems));
        System.out.println("Goodbye");
    }

    public static int sum(int[] elems) {
        int sum = 0;
        for (int elem : elems) {
            sum += elem;
        }
        return sum;
    }

    public static int[] readClientElemsFromConsole() {
        Scanner scanner = new Scanner(System.in);

        int[] elems = new int[0];

        int n = readClientElem(scanner);
        while (n != 0) {
            elems = addLastElem(elems, n);

            n = readClientElem(scanner);
        }
        return elems;
    }

    public static int readClientElem(Scanner scanner) {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }

    public static int[] addLastElem(int[] elems, int n) {
        int[] newElems = Arrays.copyOf(elems, elems.length + 1);
        newElems[newElems.length - 1] = n;
        return newElems;
    }

}
