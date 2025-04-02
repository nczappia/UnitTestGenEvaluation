import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> countUpTo(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i < n; i++) {
            boolean is_prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                primes.add(i);
            }
        }
        return primes;
    }
}