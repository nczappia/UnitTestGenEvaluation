import java.util.*;
import java.lang.*;

class Solution {
    
    public Map<String, Integer> histogram(String test) {
        Map<String, Integer> dict1 = new HashMap<>();
        List<String> list1 = Arrays.asList(test.split(" " ));
        int t = 0;
        for (String i : list1) {
            if (Collections.frequency(list1, i) > t && !i.isEmpty()) {
                t = Collections.frequency(list1, i);
            }
        }
        if (t > 0) {
            for (String i : list1) {
                if (Collections.frequency(list1, i) == t) {
                    dict1.put(i, t);
                }
            }
        }
        return dict1;
    }
}