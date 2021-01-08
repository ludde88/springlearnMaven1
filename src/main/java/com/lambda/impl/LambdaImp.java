package com.lambda.impl;

import com.lambda.interfaces.LambdaInterface;

public class LambdaImp  {

    public void test1(){
        System.out.println("test1");
    }

    public void test2(){
        System.out.println("test2");
    }

    public static void main(String[] args) {
        LambdaInterface lambdaInterface = (int a, int b)->{
            System.out.println(a+b);
        };
        /*LambdaInterface lambdaInterface = (int a,int b)->{
            System.out.println(a+"------"+b);
        };
        lambdaInterface.methods(100,200);*//*
        //System.out.println(Thread.currentThread().getName()+"----"+Thread.currentThread().getId());
        LambdaImp lambdaImp = new LambdaImp();
        new Thread(()->lambdaImp.test1(),"test1").start();
        new Thread(()->lambdaImp.test2(),"test2").start();*/
    }
}
