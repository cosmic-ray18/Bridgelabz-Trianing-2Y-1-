package Array.Level_1;

import java.util.Scanner;

public class Only_Positive {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] nums = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.print("Enter the numbers: ");
        while(true){
            nums[index]=sc.nextInt();
            if(nums[index]<=0 || index==10){
                break;
            }
            index++;
        }
        for(int i = 0;i<index;i++){
            System.out.println(nums[i]);
            total += nums[i];
        }
        System.out.println("Total of all numbers: "+ total);
    }
}
