package com.bvan.oop.lessons1_2.dynamic_array.oop;

import java.io.InputStream;
import java.util.Scanner;

/**
 * @author bvanchuhov
 */
public class RepeatableReader {

    private final Scanner scanner;

    public RepeatableReader(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public int nextInt() {
        System.out.print(">> ");

        while (!scanner.hasNextInt()) {
            scanner.next(); // skip

            System.out.println("Illegal input");
            System.out.print(">> ");
        }

        return scanner.nextInt();
    }
}
