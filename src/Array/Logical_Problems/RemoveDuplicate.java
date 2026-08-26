package Array.Logical_Problems;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RemoveDuplicate {

    public static void removeDuplicate(int[] arr){
        for (int i = 0;i<arr.length;i++){
            for (int j = i+1;j<arr.length;j++){
                if (arr[i]==arr[j]){
                    arr[i]= Integer.MIN_VALUE;
                    arr[j]=Integer.MIN_VALUE;
                }
            }
        }
        System.out.println("\nArray with Non Duplicate elements");
        display(arr);
    }
    public static void display(int[] arr){
        for (int i = 0;i<arr.length;i++){
            if (arr[i]>Integer.MIN_VALUE){
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int size = sc.nextInt();
        System.out.println("Enter the elements of the array: ");
        int arr[] = new int[size];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        removeDuplicate(arr);
    }
}
