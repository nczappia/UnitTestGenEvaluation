import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> sortEven(List<Integer> l) {
        List<Integer> even = new ArrayList<>();
        for (int i = 0; i < l.size(); i += 2) {
            even.add(l.get(i));
        }
        Collections.sort(even);
        List<Integer> result = l;
        for (int i = 0; i < l.size(); i += 2) {
            result.set(i, even.get(i / 2));
        }
        return result;
    }
}