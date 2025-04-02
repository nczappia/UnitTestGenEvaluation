import java.util.*;
import java.lang.*;

class Solution {
    
    public String intersection(List<Integer> interval1, List<Integer> interval2) {
        int l = Math.max(interval1.get(0), interval2.get(0));
        int r = Math.min(interval1.get(1), interval2.get(1));
        int length = r - l;
        if (length <= 0) {
            return "NO";
        }
        if (length == 1) {
            return "NO";
        }
        if (length == 2) {
            return "YES";
        }
        for (int i = 2; i < length; i++) {
            if (length % i == 0) {
                return "NO";
            }
        }
        return "YES";
    }
}