package Array.Logical_Problems;

import java.util.Scanner;

public class Prime {

    public static boolean check(int n){
        if (n<=1){
            return false;
        }
        else {
            int count = 0;
            for (int i = 1; i <= n; i++) {
                if (n % i == 0) {
                    count++;
                }

            }
            return count == 2;
        }
}
 public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
     System.out.println(check(n));
    }
}
