package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class CurrentThreadExample {

    public static void main(String[] args) {
        showThreadName("1");

        new Thread(new Runnable() {
            @Override
            public void run() {
                showThreadName("2");
            }
        }).start();
    }

    private static void showThreadName(String s) {
        Thread thread = Thread.currentThread();
        System.out.println(s + " - " + thread.getName());
    }
}
