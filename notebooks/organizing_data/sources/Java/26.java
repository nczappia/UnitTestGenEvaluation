import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    
    public List<Integer> removeDuplicates(List<Integer> numbers) {
        Map<Integer, Integer> c = new HashMap<>();
        for (int i : numbers) {
            c.put(i, c.getOrDefault(i, 0) + 1);
        }
        return numbers.stream().filter(i -> c.get(i) == 1).collect(Collectors.toList());
    }
}