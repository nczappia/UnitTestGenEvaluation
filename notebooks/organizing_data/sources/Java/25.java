import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> factorize(int n) {
        List<Integer> fact = new ArrayList<>();
        int i = 2;
        while (n > 1) {
            if (n % i == 0) {
                fact.add(i);
                n /= i;
            } else {
                i++;
            }
        }
        return fact;
    }
}