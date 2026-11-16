package recursion.Arrays;

public class LinearSearch {
    public static int search(int[] arr,int index,int target){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        int small = search(arr,index+1,target);
        return small;
    }
    public static void main(String[] args){
        int[] arr = {4,3,1,5,2};
        System.out.println(search(arr,0,5));
    }
}
