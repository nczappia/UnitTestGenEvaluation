import java.util.*;
import java.lang.*;

class Solution {
    
    public int doubleTheDifference(List<Object> lst) {
        return lst.stream().filter(i -> i instanceof Integer p && p > 0 && p % 2 != 0).map(i -> (Integer) i * (Integer) i).reduce(Integer::sum).orElse(0);
    }
}