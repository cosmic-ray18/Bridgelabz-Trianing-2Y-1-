package Array.Level_1;

import java.util.Scanner;

public class Avg_Height {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        System.out.println("Enter the heights: ");
        for(int i = 0;i<heights.length;i++){
            heights[i]=sc.nextDouble();
            sum += heights[i];
        }
        System.out.print("Mean of Heights: "+sum/11);
    }
}
