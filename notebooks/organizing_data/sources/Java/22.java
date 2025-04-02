import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> filterIntergers(List<Object> values) {
        List<Integer> result = new ArrayList<>();
        for (Object x : values) {
            if (x instanceof Integer) {
                result.add((Integer) x);
            }
        }
        return result;
    }
}