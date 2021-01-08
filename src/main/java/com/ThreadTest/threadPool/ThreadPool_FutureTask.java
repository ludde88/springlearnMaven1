package com.ThreadTest.threadPool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;
import java.util.concurrent.Callable;

public class ThreadPool_FutureTask {
    public static void main(String[] args)  {

        FutureTask<String> futureTask = new FutureTask<String>(
                ()->{
                    return "test Callable";
                });
                /*new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return null;
                    }
                }*/
        new Thread(futureTask).start();
        try {
            System.out.println(futureTask.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}
