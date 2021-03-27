package com.sda.zdjavapol68.example.zad37_appendix;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<String> list = new CopyOnWriteArrayList<>();

        MyModel myModel = new MyModel();

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() ->  {
            synchronized (myModel) {
                myModel.state++;
            }
        });
        executorService.execute(() ->  {
            synchronized (myModel) {
                int state = myModel.state;
                int newState = state + 1;
                myModel.state = newState;
                System.out.println("atomic");
            }
        });

        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);

        System.out.println(myModel.state);
    }


    private static class MyModel {
        private int state = 7;
    }

}
