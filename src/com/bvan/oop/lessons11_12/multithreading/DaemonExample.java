package com.bvan.oop.lessons11_12.multithreading;

/**
 * @author bvanchuhov
 */
public class DaemonExample {

    public static void main(String[] args) {
        Thread musicThread = new Thread(new MusicTask());
        musicThread.setDaemon(true);
        musicThread.start();

        ThreadUtils.println("Start work");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ThreadUtils.println("Finish work");
    }
}

class MusicTask implements Runnable {

    @Override
    public void run() {
        try {
            while (true) {
                ThreadUtils.println("Music...");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            ThreadUtils.println("Finally");
        }
    }
}
