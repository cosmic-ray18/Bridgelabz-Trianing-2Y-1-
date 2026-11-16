package recursion.Strings;

public class Filter {
    public static String remove(String name , int index) {
        if(index==name.length()){
            return "";
        }
        String small = remove(name, index + 1);
        if(name.charAt(index)!='y') {
            return name.charAt(index) + small;
        }
        else{
            return small;
        }
    }
    public static void main(String[] args){
        System.out.print(remove("Ramyyyyyyyyyyyyyyyyyya",0));
    }
}
