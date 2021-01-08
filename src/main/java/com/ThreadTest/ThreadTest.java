package com.ThreadTest;

public class ThreadTest extends Thread{
    private int i =1;
    public  static final Object o = new Object();
    @Override
    public void run() {
        System.out.println(i);
        i++;
    }

    public void test1(){
        synchronized (o) {
            System.out.println("test1");
            test2();
        }
    }

    public void test2(){
        System.out.println("test2");
    }

    public static void main(String[] args) {
        /*System.out.println("start");
        ThreadTest threadTest = new ThreadTest();
        threadTest.start();*/
        //threadTest.start();
        new Thread(()->{
            long id = Thread.currentThread().getId();
            String name = Thread.currentThread().getName();
            System.out.println(id+"   "+name);
            ThreadTest threadTest = new ThreadTest();
            threadTest.test1();
        },"t1").start();

    }
}
