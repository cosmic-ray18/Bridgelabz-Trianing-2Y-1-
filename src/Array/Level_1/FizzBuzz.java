package Array.Level_1;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        String[] results = new String[num];
        int index = 0;
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i%3== 0 && i % 5==0) {
                    results[index] = "FizzBuzz";
                    index++;
                    System.out.println("Positon " + i + " = " + results[index - 1]);
                } else if (i % 5 == 0) {
                    results[index] = "Buzz";
                    index++;
                    System.out.println("Positon " + i + " = " + results[index - 1]);
                } else if (i % 3 == 0 ) {
                    results[index] = "Fizz";
                    index++;
                    System.out.println("Positon " + i + " = " + results[index - 1]);
                } else {
                    System.out.println("Positon " + i + " = " + i);
                }
            }
        }
    }
}
