package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class BarWithMultithreading {

    public static void main(String[] args) {
        ThreadUtils.println("Bar is opened");

        for (int id = 1; id <= 3; id++) {
            Runnable drinker = new Drinker(id);
            Thread drinkerThread = new Thread(drinker);
            drinkerThread.start();
        }

        ThreadUtils.println("Bar is closed");
    }
}
