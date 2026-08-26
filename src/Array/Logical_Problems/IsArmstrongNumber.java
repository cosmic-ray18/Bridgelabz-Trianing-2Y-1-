package Array.Logical_Problems;

public class IsArmstrongNumber {
    public static int count(int n){
        int count = 0;
        while(n>0){
            count++;
            n = n/10;
        }
        return count;
    }

    public static boolean isArmstrong(int n){
        int original = n;
        int sum = 0;
        int d = count(n);
        while(n>0){
            int rem = n%10;
            sum += (int)Math.pow(rem,d);
            n = n/10;
        }
        return original==sum;
    }

    public static void main(String[] args){
        System.out.println(isArmstrong(1634));
    }
}
