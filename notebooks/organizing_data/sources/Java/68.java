import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> pluck(List<Integer> arr) {
        List<Integer> result = new ArrayList<>();
        if (arr.size() == 0) {
            return result;
        }
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) % 2 == 0) {
                if (arr.get(i) < min) {
                    min = arr.get(i);
                    minIndex = i;
                }
            }
        }
        if (minIndex != -1) {
            result.add(min);
            result.add(minIndex);
        }
        return result;
    }
}