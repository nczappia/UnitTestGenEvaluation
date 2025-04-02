import java.util.*;
import java.lang.*;

class Solution {
    
    public Optional<Integer> nextSmallest(List<Integer> lst) {
                Set < Integer > set = new HashSet<>(lst);
        List<Integer> l = new ArrayList<>(set);
        Collections.sort(l);
        if (l.size() < 2) {
            return Optional.empty();
        } else {
            return Optional.of(l.get(1));
        }
    }
}