package Array.LeetCode;

import java.util.Scanner;

public class LeetCode_167 {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();
    int[] nums = new int[size];
    for(int i = 0;i<size;i++){
        nums[i]=sc.nextInt();
    }
    int target = sc.nextInt();
    int start = 0;
    int end = size-1;
    int sum = 0;
    while(start<end){
        sum = nums[start]+nums[end];
        if(sum==target){
            System.out.print((start+1) +" "+(end+1));
            break;
        }
        else if(sum>target){
            end--;
        }
        else{
            start++;
        }
    }
    }
}
