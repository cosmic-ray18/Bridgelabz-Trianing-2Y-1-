package recursion.Strings;

import java.util.ArrayList;
import java.util.Collections;

public class Subsequence {
    public static ArrayList<String> getSSQ(String s) {
        ArrayList<String> ans = new ArrayList<>();
        if (s.length() == 0) {
            ans.add("");
            return ans;
        }
        char ch = s.charAt(0);
        ArrayList<String> smallAns = getSSQ(s.substring(1));
        for (String ss : smallAns) {
            ans.add(ss);//[bc,b,c,""]
            ans.add(ch + ss);//[abc,ab,ac,a]
        }
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(getSSQ("abc"));
    }
}