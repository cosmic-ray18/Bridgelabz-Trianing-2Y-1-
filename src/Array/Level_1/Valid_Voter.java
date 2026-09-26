package Array.Level_1;

import java.util.Scanner;

public class Valid_Voter {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int size = 10;
        int[] ages = new int[size];
        System.out.print("Enter the Age of Students: ");
        for(int i = 0;i<size;i++){
            ages[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            if(ages[i]<0){
                System.out.println(ages[i]+"is invalid Age");
            }
            else if(ages[i]<18){
                System.out.println("The student with the age "+ages[i]+" cannot vote");
            }
            else{
                System.out.println("The student with the age "+ages[i]+" can vote");
            }
        }
    }
}
