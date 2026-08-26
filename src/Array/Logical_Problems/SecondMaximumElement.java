package Array.Logical_Problems;

import java.util.Scanner;

public class SecondMaximumElement {
    public static int Max(int arr[]){
        int max = Integer.MIN_VALUE;
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void secondMax(int[] arr) {
        int max = Max(arr);
        for (int i = 0;i<arr.length;i++){
            if (arr[i]==max){
                arr[i] = Integer.MIN_VALUE;
            }
        }
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
       secondMax(arr);
        Max(arr);
    }
}

