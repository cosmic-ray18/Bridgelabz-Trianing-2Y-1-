package recursion.Strings;

public class Palindrome {
    public static boolean check(String name, int start,int end) {
        if(start>=end){
            return true;
        }
        if (name.charAt(start) != name.charAt(end)){
            return false;
        }
        return check(name,start+1,end-1);
    }

    public static void main(String[] args){
        String temp = "madam";
        System.out.println(check(temp, 0,temp.length()-1));
    }
}
