package com.ThreadTest;

public class ThreadTest3 {
   public  static    boolean flag = false;
    public static void main(String[] args) {
        Object o = new Object();

        char[] as = "1234567".toCharArray();
        char[] bs = "ABCDEFG".toCharArray();

        Thread t1 = new Thread(()->{
                synchronized (o){
                    if(!flag){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    for(int i=0;i<as.length;i++){
                        System.out.print(as[i]);
                        try {
                            o.notify();
                            o.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    o.notify();
                }

            });

        Thread t2 = new Thread(()->{
            synchronized (o){
                    if(!flag){
                        flag = true;
                    }
                    for(int i=0;i<bs.length;i++){
                        System.out.print(bs[i]);
                        try {
                            o.notify();
                            o.wait();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    o.notify();

            }
        });
        t1.start();
        t2.start();

    }
}
