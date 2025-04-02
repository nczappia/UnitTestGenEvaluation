import java.util.*;
import java.lang.*;

class Solution {
    
    public int maxFill(List<List<Integer>> grid, int capacity) {
        int sum = 0;
        for (List<Integer> arr : grid) {
            sum += Math.ceil((double) arr.stream().reduce(Integer::sum).get() / capacity);
        }
        return sum;
    }
}