import java.util.*;
import java.lang.*;

class Solution {
    
    public String matchParens(List<String> lst) {
        List<String> S = Arrays.asList(lst.get(0) + lst.get(1), lst.get(1) + lst.get(0));
        for (String s : S) {
            int val = 0;
            for (char i : s.toCharArray()) {
                if (i == '(') {
                    val += 1;
                } else {
                    val -= 1;
                }
                if (val < 0) {
                    break;
                }
            }
            if (val == 0) {
                return "Yes";
            }
        }
        return "No";
    }
}