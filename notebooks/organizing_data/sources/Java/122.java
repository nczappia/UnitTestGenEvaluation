import java.util.*;
import java.lang.*;

class Solution {
    
    public int addElements(List<Integer> arr, int k) {
        arr = arr.subList(0, k);
        Optional<Integer> sum = arr.stream().filter(p -> String.valueOf(Math.abs(p)).length() <= 2).reduce(Integer::sum);
        return sum.orElse(0);
    }
}