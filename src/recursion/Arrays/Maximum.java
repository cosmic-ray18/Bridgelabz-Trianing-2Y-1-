package recursion.Arrays;

public class Maximum {
    public static int max(int[] arr, int index) {
        if(index== arr.length-1){
            return arr[index];
        }
        int small =  max(arr,index+1);
        return Math.max(small,arr[index]);
    }

    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 2};
        System.out.println(max(arr, 0));
    }
}
