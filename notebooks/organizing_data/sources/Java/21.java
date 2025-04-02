import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Double> rescaleToUnit(List<Double> numbers) {
        double min_number = Collections.min(numbers);
        double max_number = Collections.max(numbers);
        List<Double> result = new ArrayList<>();
        for (double x : numbers) {
            result.add((x - min_number) / (max_number - min_number));
        }
        return result;
    }
}