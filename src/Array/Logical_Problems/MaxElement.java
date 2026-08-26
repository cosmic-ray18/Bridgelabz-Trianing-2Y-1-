package Array.Logical_Problems;

import java.util.*;

public class MaxElement {
    public static void Max(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("Maximum element:" + max);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[size];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        Max(arr);
    }
}
