import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> oddCount(List<String> lst) {
        List<String> res = new ArrayList<>();
        for (String arr : lst) {
            int n = 0;
            for (char d : arr.toCharArray()) {
                if ((d - '0') % 2 == 1) {
                    n += 1;
                }
            }
            res.add("the number of odd elements " + n + "n the str" + n + "ng " + n + " of the " + n + "nput." );
        }
        return res;
    }
}