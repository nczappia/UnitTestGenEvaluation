import java.util.*;
import java.lang.*;

class Solution {
    
    public String filenameCheck(String file_name) {
        List<String> suf = Arrays.asList("txt", "exe", "dll");
        String[] lst = file_name.split("\\." );
        if (lst.length != 2 || !suf.contains(lst[1]) || lst[0].isEmpty() || !Character.isLetter(lst[0].charAt(0))) {
            return "No";
        }
        int t = (int) lst[0].chars().map(x -> (char) x).filter(Character::isDigit).count();
        if (t > 3) {
            return "No";
        }
        return "Yes";
    }
}