package recursion.Basic_Programs;

public class GCD {
    public static int divisor(int x, int y) {
        if(y%x==0){
            return x;
        }
        int gcd = divisor(y%x,x);
        return gcd;
    }

    public static void main(String[] args) {
        System.out.println(divisor(31,43));
    }
}

