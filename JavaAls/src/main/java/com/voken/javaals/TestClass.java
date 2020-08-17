package com.voken.javaals;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TestClass {

    public static void main(String[] args){
        System.out.print("Enter Demo\n");
        listComine();
        BinarySerch();
        combineSort();
        insertSort();
        quickSort();
        maxSum();
    }

    private static void listComine(){
        System.out.println("Start listCombine");
        ArrayList<Integer> listA = new ArrayList<>();
        listA.add(1);
        listA.add(3);
        listA.add(5);
        listA.add(7);
        ArrayList<Integer> listB = new ArrayList<>();
        listB.add(2);
        listB.add(3);
        listB.add(6);
        listB.add(8);
        listB.add(10);
        listB.add(11);
        List<Integer> retList = ListCombine.combineList(listA,listB);
        for(Integer i : retList){
            System.out.println(i);
        }
    }

    private static void BinarySerch(){
        System.out.print("Start BinarySearch\n");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 1024 ;i++){
            list.add(i);
        }
        int index = BinarySearch.BinarySearch(list,1539);
        System.out.println(index);
    }

    private static void combineSort(){
        System.out.print("\nStart combineSort\n");
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i < 20 ;i++){
            list.add(new Random().nextInt(100));
        }
        List<Integer> retLit = CombineSort.CombineSort(list);
        for(Integer num : retLit){
            System.out.print(" \n " + num);
        }
    }

    private static void insertSort(){
        System.out.print("\nStart insertSort\n");
        int[] array = new int[]{9,9,8,6,7,5,6,4,4,3};
        int[] dstArray = InsertSort.InsertSort(array);
        for( int i = 0; i < dstArray.length; i++){
            System.out.print(" \n " + dstArray[i]);
        }
    }

    private static void quickSort(){
        System.out.print("\nStart quickSort\n");
        int[] array = {1,2,8,3,4,9,6,8,2,5};
        QuickSort.QuickSort(array,0,array.length-1);
        for(int i = 0; i < array.length; i++){
            System.out.print(" \n " + array[i]);
        }
    }

    private static void maxSum(){
        System.out.print("\nStart maxSum\n");
        int[] array = {1,-2,3,10,-4,7,2,-5};
        int maxSum = MaxSum.maxSum(array);
        System.out.print(" \n max =  " + maxSum);
    }
}