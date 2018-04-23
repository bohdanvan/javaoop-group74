package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class Drinker implements Runnable {

    private final int id;

    public Drinker(int id) {
        this.id = id;
    }

    @Override
    public void run() {
//        if (id == 1) {
//            throw new RuntimeException();
//        }
        for (int beer = 1; beer <= 5; beer++) {
            ThreadUtils.println("I'm " + id + " drinker. " +
                    "I'm drinking " + beer + " beer");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
