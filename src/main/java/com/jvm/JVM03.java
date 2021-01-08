package com.jvm;

public class JVM03 {
    private volatile int x = 0;
    private int t;

    private   int z;


    public void test(int a,int b,int c){
        int i=8;
        i=++i;
        System.out.println(i);
    }

    public  void test1(){

        x++;
    }

    public void test2(){
        JVM03 jvm03 = new JVM03();
    }

    public void test3(){
        t++;
    }

    public synchronized void test4(){

    }

    public  void test5 (){
        String a = "aa";
        synchronized(a){

        }

    }
}
