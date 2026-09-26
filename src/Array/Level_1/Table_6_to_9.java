package Array.Level_1;

import java.util.Scanner;

public class Table_6_to_9 {
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the number from 6 to 9 : ");
            int num = sc.nextInt();
            if(num>=6 && num<=9) {
                int[] results = new int[11];
                for (int i = 1; i < 11; i++) {
                    results[i] = num * i;
                    System.out.println(num + " * " + i + " = " + results[i]);
                }
            }
            else{
                System.out.println("Invalid Number11");
            }
        }
    }
