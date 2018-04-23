package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class RunnableExample {

    public static void main(String[] args) {
        System.out.println("0");

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("1");
            }
        }).start();

        System.out.println("2");
    }
}
