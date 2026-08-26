package com.Arrays;

import java.util.ArrayList;

public class LearningArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0,1);
        list.add(1,3);
        list.add(2,7);
        list.add(3,2);
        System.out.println(list);
        System.out.println("We have converted arraylist into array:-");
        int arr[] = new int[4];
        for (int i = 0;i<arr.length;i++){
            arr[i]=list.get(i);
            System.out.println(arr[i]);
        }

    }
}
