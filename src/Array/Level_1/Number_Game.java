package Array.Level_1;

import java.util.Scanner;

public class Number_Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = 5;
        int[] nums = new int[size];
        System.out.print("Enter the Five Numbers: ");
        for(int i = 0;i<size;i++){
            nums[i]=sc.nextInt();
        }
        for(int i = 0;i<size;i++){
            if(nums[i]>0){
                if(nums[i]%2==0){
                    System.out.println("The number "+nums[i]+" is even-posiitve");
                }
                if(nums[i]%2!=0){
                    System.out.println("The number "+nums[i]+" is odd-posiitve");
                }
            }
            if (nums[i] < 0) {
                System.out.println("The number "+nums[i]+" is negative");
            }
            if(nums[i]==0){
                System.out.println("The number "+nums[i]+" is zero");
            }
            if(i==4){
                if(nums[0]>nums[4]){
                    System.out.println("The First element is greater than last element");
                }
                else if(nums[0]<nums[4]){
                    System.out.println("The First element is less than last element");
                }
                else{
                    System.out.println("Both are equal");
                }
            }
        }

    }
}
