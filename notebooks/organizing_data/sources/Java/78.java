import java.util.*;
import java.lang.*;

class Solution {
    
    public int hexKey(String num) {
        String primes = "2357BD";
        int total = 0;
        for (char c : num.toCharArray()) {
            if (primes.indexOf(c) != -1) {
                total += 1;
            }
        }
        return total;
    }
}