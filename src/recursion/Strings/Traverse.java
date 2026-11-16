package recursion.Strings;

public class Traverse {
    public static void print(String name , int index){
       if(index==name.length()){
           return;
       }
        System.out.print(name.charAt(index));
         print(name,index+1);
    }
    public static void main (String[] args){
        print("Ashutosh",0);
    }
}
