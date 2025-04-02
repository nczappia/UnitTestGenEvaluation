import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean willItFly(List<Integer> q, int w) {
        if (q.stream().reduce(0, Integer::sum) > w) {
            return false;
        }
        int i = 0, j = q.size() - 1;
        while (i < j) {
            if (!Objects.equals(q.get(i), q.get(j))) {
                return false;
            }
            i += 1;
            j -= 1;
        }
        return true;
    }
}