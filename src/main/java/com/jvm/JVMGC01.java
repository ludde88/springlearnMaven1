package com.jvm;

public class JVMGC01 {
    public static void main(String[] args) {
        for (int i=0;i<1000000;i++){
            JVMGC01 jvmgc01 = new JVMGC01();
            System.out.println(i);
        }
    }
}
