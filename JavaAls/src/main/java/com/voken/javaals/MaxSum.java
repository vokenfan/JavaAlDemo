package com.voken.javaals;

public class MaxSum {

    public static int maxSum(int[] array){
        if(array == null || array.length == 0){
            return 0;
        }
        int max = 0;
        int curMax = 0;
        for(int i = 0; i < array.length; i++){
            if(curMax <= 0){
                curMax = array[i];
            }else{
                curMax += array[i];
            }
            if(curMax > max){
                max = curMax;
            }
        }
        return max;
    }

}
