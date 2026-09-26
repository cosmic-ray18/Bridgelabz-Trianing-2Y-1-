package Array.Level_1;

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int[] results = new int[11];
        for(int i = 1;i<11;i++){
            results[i] = num*i;
            System.out.println(num + " * " + i + " = " + results[i]);
        }
    }
}
