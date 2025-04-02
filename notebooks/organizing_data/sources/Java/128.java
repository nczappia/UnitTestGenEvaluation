import java.util.*;
import java.lang.*;

class Solution {
    
    public Optional<Integer> prodSigns(List<Integer> arr) {
        if (arr.size() == 0) {
            return Optional.empty();
        }
        if (arr.contains(0)) {
            return Optional.of(0);
        }
        int prod = (int) (-2 * (arr.stream().filter(p -> p < 0).count() % 2) + 1);
        return Optional.of(prod * (arr.stream().map(Math::abs).reduce(Integer::sum)).get());
    }
}