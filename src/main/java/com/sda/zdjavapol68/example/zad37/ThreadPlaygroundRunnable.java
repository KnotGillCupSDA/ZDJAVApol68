package com.sda.zdjavapol68.example.zad37;

import java.util.Random;

class ThreadPlaygroundRunnable implements Runnable {

    private final String name;

    ThreadPlaygroundRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            int i = 0;
            while (true) {
                System.out.println(String.join(":", Thread.currentThread().getName(), name, String.valueOf(i)));
                Thread.sleep(new Random().nextInt(100));
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public String toString() {
        return "ThreadPlaygroundRunnable{" +
                "name='" + name + '\'' +
                '}';
    }
}
