package com.voken.javaals;

import java.util.ArrayList;

/**
 * 插入排序
 */
public class InsertSort {
    public static int[] InsertSort(int[] srcArray){
        for(int i = 1; i < srcArray.length; i++){
            int temp = srcArray[i];
            int j ;
            for(j = i ; j > 0 && srcArray[j-1] > temp; j--){
                srcArray[j] = srcArray[j-1];
            }
            srcArray[j] = temp;
        }
        return srcArray;
    }
}
