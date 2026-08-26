package Array.Logical_Problems;

import java.util.*;

public class ReverseArray {
    public static void reverse(int arr[]){
          int a = 0;
          int b = arr.length-1;
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }
    public static void display(int arr[]){
        for (int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int Size = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int arr[] = new int[Size];
        for (int i = 0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("\nThis is the original array: ");
        display(arr);

        System.out.println("\nThis is the reversed array");
        reverse(arr);
        display(arr);
    }
}
