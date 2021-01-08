package com.ThreadTest;

public class ThreadTest2 {
    public  int count = 1;
    //public ThreadTest2 threadTest2 = new ThreadTest2();
    public ThreadTest threadTest = new ThreadTest();
    public synchronized void m1() {
        synchronized (threadTest){
            while (count < 50) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                System.out.println("m1_" + count);
            }
        }
    }

    public  void m2(){
        synchronized(threadTest) {
            while (count < 60) {
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                count++;
                System.out.println("m2_" + count);
            }
        }
    }

    public static void main(String[] args) {
        ThreadTest2 t = new ThreadTest2();
        new Thread(t::m1).start();
        new Thread(t::m2).start();
        System.out.println("111111111111111111111");

    }
}
