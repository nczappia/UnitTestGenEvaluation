import java.util.*;
import java.lang.*;

class Solution {
    
    public int primeFib(int n) {
        int f0 = 0, f1 = 1;
        while (true) {
            int p = f0 + f1;
            boolean is_prime = p >= 2;
            for (int k = 2; k < Math.min(Math.sqrt(p) + 1, p - 1); k++) {
                if (p % k == 0) {
                    is_prime = false;
                    break;
                }
            }
            if (is_prime) {
                n -= 1;
            }
            if (n == 0) {
                return p;
            }
            f0 = f1;
            f1 = p;
        }
    }
}