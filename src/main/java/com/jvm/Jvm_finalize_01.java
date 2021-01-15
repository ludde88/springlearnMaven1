package com.jvm;

public class Jvm_finalize_01 {
    private static Jvm_finalize_01 jvm_finalize_01;

    public void test1(){
        System.out.println("Jvm_finalize_01 is ok");
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("finalize in");
        jvm_finalize_01 = this;
    }

    public static void main(String[] args) throws Exception {
        jvm_finalize_01 = new Jvm_finalize_01();
        jvm_finalize_01 = null;
        System.gc();
        Thread.sleep(500);
        if(jvm_finalize_01 == null){
            System.out.println("jvm_finalize_01 is null");
        }else{
            jvm_finalize_01.test1();
        }

        System.out.println("==================1234444444============================");

        jvm_finalize_01 = null;
        System.gc();
        Thread.sleep(500);
        if(jvm_finalize_01 == null){
            System.out.println("jvm_finalize_01 is null");
        }else{
            jvm_finalize_01.test1();
        }

    }
}
