package recursion.Arrays;

public class SumOfArray {
    public static int sum(int[] arr,int index){
        if(index==arr.length){
            return 0;
    }
    int small = sum(arr,index+1);
        return small+arr[index];
}

    public static void main(String[] args) {
        int[] arr = {2, 3, 7, 8, 9, 1, 10};
        System.out.println(sum(arr,0));
    }
}
