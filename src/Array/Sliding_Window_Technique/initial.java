package Array.Sliding_Window_Technique;

import java.util.Scanner;

public class initial {
    public static void main(String [] args) {
           Scanner sc = new Scanner(System.in);
           int size= sc.nextInt();
           int[] nums = new int[size];
           for(int i = 0;i<size;i++){
               nums[i]= sc.nextInt();
           }
           int slide = sc.nextInt();
           int sum = 0;
           for(int i = 0;i<slide;i++){
               sum+=nums[i];
           }
           System.out.println(sum);
           for(int i = 1;i<=nums.length-slide;i++){
               sum = sum - nums[i-1] + nums[i+slide-1];
   System.out.println(sum);
}
}
}
