package com.sda.zdjavapol68.example.zad37;

import java.util.List;
import java.util.concurrent.*;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 10; i++) {
            executorService.execute(new ThreadPlaygroundRunnable("Runnable" + i));
        }

        executorService.shutdown();
        if(!executorService.awaitTermination(10, TimeUnit.SECONDS)) {
            System.out.println("awaiting failed - performing a hard shutdown");
            List<Runnable> runnables = executorService.shutdownNow();
            System.out.println(runnables);
        }


    }
}
