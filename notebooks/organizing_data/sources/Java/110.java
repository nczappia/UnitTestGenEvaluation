import java.util.*;
import java.lang.*;

class Solution {
    
    public String exchange(List<Integer> lst1, List<Integer> lst2) {
        int odd = 0, even = 0;
        for (int i : lst1) {
            if (i % 2 == 1) {
                odd += 1;
            }
        }
        for (int i : lst2) {
            if (i % 2 == 0) {
                even += 1;
            }
        }
        if (even >= odd) {
            return "YES";
        }
        return "NO";
    }
}