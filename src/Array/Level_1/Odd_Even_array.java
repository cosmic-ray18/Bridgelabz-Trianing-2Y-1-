package Array.Level_1;

import java.util.Scanner;

public class Odd_Even_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        if(number<1){
            System.out.println("Invalid Number");
        }
        else{
            int[] even = new int[number/2+1];
            int[] odd = new int[number/2+1];
            int even_index = 0;
            int odd_index = 0;
            for(int i = 1;i<=number;i++){
                if(i%2==0){
                    even[even_index]=i;
                    even_index++;
                }
                else{
                    odd[odd_index]=i;
                    odd_index++;
                }
            }
            System.out.print("Even Numbers: ");
            for(int i = 0;i<even_index;i++){
                System.out.print(even[i]+" ");
            }
            System.out.println();
            System.out.print("Odd Numbers: ");
            for(int i = 0;i<odd_index;i++){
                System.out.print(odd[i]+" ");
            }
        }
        }

}
