package com.lambda.impl;

public class LambdaTest2 {
    public int a;
    public int b;
    LambdaTest2(){

    }
    LambdaTest2(int id, String name, double price){

    }
    LambdaTest2(int a, int b){
        this.a = a;
        this.b = b;
    }
    public void test3(){
        System.out.println("1111"+a+b);
    }
}

interface ItemCreatorBlankConstruct {
    LambdaTest2 getItem1();
}
interface ItemCreatorParamContruct {
    LambdaTest2 getItem(int id, String name, double price);
}

 class Exe2 {
    public static void main(String[] args) {
        /*ItemCreatorBlankConstruct creator = () -> new LambdaTest2();
        LambdaTest2 item = creator.getItem1();

        ItemCreatorBlankConstruct creator2 = LambdaTest2::new;
        LambdaTest2 item2 = creator2.getItem1();

        ItemCreatorParamContruct creator3 = LambdaTest2::new;
        LambdaTest2 item3 = creator3.getItem(112, "鼠标", 135.99);*/
        LambdaTest2 lambdaTest2 = new LambdaTest2(1,2){
            public void test3(){
                System.out.println("222"+a+b);
            }
        };
        LambdaTest2 lambdaTest1 = new LambdaTest2(1,2);
        lambdaTest1.test3();
        lambdaTest2.test3();
    }
}
