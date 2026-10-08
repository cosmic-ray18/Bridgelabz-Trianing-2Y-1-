package recursion.Basic_Programs;

public class Demo1 {
    public static int function1(){
        int x=1;
        function2();
        return x;
}
    public static int function2(){
        int x=2;
        function3();
        return x;
    }
    public static int function3(){
        int x = 3;
        return x;
    }
    public static void main(String[] args){
        System.out.println(function1());
    }
}
