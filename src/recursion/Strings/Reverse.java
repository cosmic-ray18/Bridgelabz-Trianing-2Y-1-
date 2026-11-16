package recursion.Strings;

public class Reverse {
    public static void reverse(String name , int index){
        if(index==name.length()){
            return;
        }
        reverse(name,index+1);
        System.out.print(name.charAt(index));
    }
    public static void main(String[] args){
        reverse("arapaytaS",0);
    }
}
