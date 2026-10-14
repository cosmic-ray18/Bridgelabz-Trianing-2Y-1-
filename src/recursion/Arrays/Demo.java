package recursion.Arrays;

public class Demo {
    public static void Inc(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        System.out.print(arr[index]+" ");
        Inc(arr,index+1);
    }
    public static void Rev(int[] arr,int index){
        if(index==arr.length){
            return;
        }
        Rev(arr,index+1);
        System.out.print(arr[index]+" ");
    }

    public static void main(String[] args) {
        int[] arr={1,2,3,4,4,5,6,7};
        Inc(arr,0);
        System.out.println();
        Rev(arr,0);
    }
}
