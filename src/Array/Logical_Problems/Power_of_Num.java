package Array.Logical_Problems;

public class Power_of_Num {
    public static int power(int num , int pow){
        int result = 1;
        while (pow>0){
            result*=num;
            pow--;
        }
        return result;
    }
    public static void main(String[] args){
        System.out.println(power(2,6));
    }
}
