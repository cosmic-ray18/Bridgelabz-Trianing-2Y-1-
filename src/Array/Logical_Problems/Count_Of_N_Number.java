package Array.Logical_Problems;

public class Count_Of_N_Number {

    public static int count(int n){
        int sum = 0;
        while (n>0){
            sum += n;
            n--;
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println(count(7));
    }
}
