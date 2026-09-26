package Array.Level_1;

import java.util.Scanner;

public class Multi_Dimensional {
    public static void main(String[] args ){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the columns: ");
        int cols = sc.nextInt();
        System.out.println();
        int[][] TwoDimensional = new int[rows][cols];
        for(int i = 0;i<rows;i++){
            System.out.print("Enter the " + (i+1) +" row elements: ");
            for(int j=0;j<cols;j++){
                TwoDimensional[i][j]=sc.nextInt();
                System.out.print(" ");
            }
            System.out.println();
        }
        int index = 0;
        int[] OneDimensional = new int[rows*cols];
        for(int i = 0;i<rows;i++){
            for(int j=0;j<cols;j++){
                OneDimensional[index]=TwoDimensional[i][j];
                index++;
                System.out.print(OneDimensional[index-1]+" ");
            }

        }
    }
}
