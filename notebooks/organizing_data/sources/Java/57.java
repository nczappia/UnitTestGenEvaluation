import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean monotonic(List<Integer> l) {
        List<Integer> l1 = new ArrayList<>(l), l2 = new ArrayList<>(l);
        Collections.sort(l1);
        l2.sort(Collections.reverseOrder());
        return l.equals(l1) || l.equals(l2);
    }
}