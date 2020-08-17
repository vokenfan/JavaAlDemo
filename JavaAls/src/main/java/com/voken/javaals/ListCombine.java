package com.voken.javaals;

import java.util.ArrayList;
import java.util.List;

/**
 * 有序数组合并
 */
public class ListCombine {
    public static List<Integer> combineList(List<Integer> aList , List<Integer> bList) {
        if (aList == null || aList.size() <= 0) {
            return bList;
        }
        if (bList == null || bList.size() <= 0) {
            return aList;
        }
        int pointA =0;
        int pointB = 0;
        ArrayList<Integer> retList= new ArrayList<>();
        while(pointA < aList.size() || pointB < bList.size() ){
            if(pointA >= aList.size()){
                retList.addAll(bList.subList(pointB,bList.size()));
                break;
            }
            if(pointB >= bList.size()){
                retList.addAll(aList.subList(pointA,aList.size()));
                break;
            }
            if(aList.get(pointA) > bList.get(pointB)){
                retList.add(bList.get(pointB));
                pointB++;
                continue;
            }else{
                retList.add(aList.get(pointA));
                pointA++;
                continue;
            }
        }
        return retList;
    }
}
