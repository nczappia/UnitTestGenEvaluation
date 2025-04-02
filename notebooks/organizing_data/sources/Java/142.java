import java.util.*;
import java.lang.*;

class Solution {
    
    public int sumSquares(List<Integer> lst) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            if (i % 3 == 0) {
                result.add(lst.get(i) * lst.get(i));
            } else if (i % 4 == 0) {
                result.add((int) Math.pow(lst.get(i), 3));
            } else {
                result.add(lst.get(i));
            }
        }
        return result.stream().reduce(Integer::sum).orElse(0);
    }
}