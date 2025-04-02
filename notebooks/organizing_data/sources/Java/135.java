import java.util.*;
import java.lang.*;

class Solution {
    
    public int canArrange(List<Integer> arr) {
        int ind = -1, i = 1;
        while (i < arr.size()) {
            if (arr.get(i) < arr.get(i - 1)) {
                ind = i;
            }
            i += 1;
        }
        return ind;
    }
}