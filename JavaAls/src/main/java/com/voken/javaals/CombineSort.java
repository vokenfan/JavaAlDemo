package com.voken.javaals;

import java.util.List;

/**
 * 归并排序
 */
public class CombineSort {

    public static List<Integer> CombineSort(List<Integer> srcList){
        if(srcList == null || srcList.size() == 0){
            return srcList;
        }
        int middle = srcList.size() / 2;
        if(middle == 0){
            return srcList;
        }
        return ListCombine.combineList(CombineSort(srcList.subList(0,middle)),CombineSort((srcList.subList(middle,srcList.size()))));
    }
}
