package com.arithmetic;

public class Arithmetic1 {

    public static int test1(int[] nums){
        int resultInt = -1;
        boolean flag = true;
        for(int i=0;i<nums.length;i++){
            if(!flag){
                break;
            }
            for(int j=0;j<nums.length&&flag;i++){
                if(i==j){
                    continue;
                }
                if(nums[i]==nums[j]){
                    resultInt = nums[i];
                    flag = false;
                    break;
                }
            }
        }
        return resultInt;
    }

    public static void main(String[] args) {
        /*[2, 3, 1, 0, 2, 5, 3]*/
        int[] num = new int[7];
        num[0] = 2;
        num[1] = 3;
        num[2] = 1;
        num[3] = 0;
        num[4] = 2;
        num[5] = 5;
        num[6] = 3;
        System.out.println(test1(num));
    }
}
