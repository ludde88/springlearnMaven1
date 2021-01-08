package com.ThreadTest.threadPool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool_SingleThreadPool01 {
    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());
        /*ExecutorService executorService = Executors.newSingleThreadExecutor();
        for(int i=0;i<5;i++){
            int finalI = i;
            executorService.execute(
                    ()->{
                        System.out.println(finalI +""+Thread.currentThread().getName());
                    }
            );
        }*/
    }
}
