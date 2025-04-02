import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> getOddCollatz(int n) {
        List<Integer> odd_collatz = new ArrayList<>();
        if (n % 2 == 1) {
            odd_collatz.add(n);
        }
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = n * 3 + 1;
            }
            if (n % 2 == 1) {
                odd_collatz.add(n);
            }
        }
        Collections.sort(odd_collatz);
        return odd_collatz;
    }
}