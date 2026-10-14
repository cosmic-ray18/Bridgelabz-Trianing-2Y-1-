package recursion.Basic_Programs;

public class SumOfDigits {

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        }
        int digit= n%10;
        int small = sum(n/10);
        return small+digit;
    }

    public static void main(String[] args) {
        System.out.println(sum(12345));
    }
}
