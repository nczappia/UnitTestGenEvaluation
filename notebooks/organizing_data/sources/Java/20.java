import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Double> findClosestElements(List<Double> numbers) {
        List<Double> closest_pair = new ArrayList<>();
        closest_pair.add(numbers.get(0));
        closest_pair.add(numbers.get(1));
        double distance = Math.abs(numbers.get(1) - numbers.get(0));
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < distance) {
                    closest_pair.clear();
                    closest_pair.add(numbers.get(i));
                    closest_pair.add(numbers.get(j));
                    distance = Math.abs(numbers.get(i) - numbers.get(j));
                }
            }
        }
        Collections.sort(closest_pair);
        return closest_pair;
    }
}