package Array.Level_1;

import java.util.Scanner;

public class Factors_0f_Num {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int max_Index = 10;
        int[] factors = new int[max_Index];
        int index = 0;
        for(int i = 1;i<num;i++){
            if(num%i==0){
            if(index==max_Index){
                max_Index=max_Index*2;
                int[] temp = new int[max_Index];
                for(int j = 0;j<10;j++){
                    temp[j]=factors[j];
                }
                factors=temp;
            }
                factors[index]=i;
                index++;
            }
        }
        for(int i = 0;i<index;i++){
            System.out.print(factors[i]+" ");
        }
    }
}
