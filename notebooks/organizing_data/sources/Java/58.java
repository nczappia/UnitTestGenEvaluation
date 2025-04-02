import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> common(List<Integer> l1, List<Integer> l2) {
        Set<Integer> ret = new HashSet<>(l1);
        ret.retainAll(new HashSet<>(l2));
        List<Integer> result = new ArrayList<>(ret);
        Collections.sort(result);
        return result;
    }
}