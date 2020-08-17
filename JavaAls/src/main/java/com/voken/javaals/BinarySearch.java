package com.voken.javaals;

import java.util.ArrayList;

/**
 * 二分查找
 */
public class BinarySearch {
    public static int BinarySearch(ArrayList<Integer> dataList,int dstNum){
        if(dataList == null || dataList.size() == 0){
            return -1;
        }
        int low = 0;
        int high = dataList.size() - 1;
        int middle = 0;
        int count = 0;
        while(low < high){
            middle = (low + high) / 2;
            System.out.print("\n middle = " + middle + "\n");
            count ++;
            if(dataList.get(middle) > dstNum){
                high = middle - 1;
            } else if(dataList.get(middle) < dstNum){
                low = middle + 1;
            } else {
                System.out.print(count + " times\n");
                return middle;
            }
        }
        System.out.print(count + "times");
        return -1;
    }
}
