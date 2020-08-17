package com.voken.javaals;


public class QuickSort {
    public static void QuickSort(int[] array,int low,int high){
        if(low > high){
            return;
        }
        int i = low;
        int j = high;
        int markNum = array[i];
        int tmp = 0;
        while(i < j){
            while(array[j] >= markNum && i < j){
                j--;
            }
            while(array[i] <= markNum && i < j){
                i++;
            }
            tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
        array[low] = array[i];
        array[i] = markNum;
        QuickSort(array,low,i-1);
        QuickSort(array,i+1,high);
    }
}
