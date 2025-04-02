import java.util.*;
import java.lang.*;

class Solution {
    
    public int largestDivisor(int n) {
        for (int i = n - 1; i > 0; i--) {
            if (n % i == 0) {
                return i;
            }
        }
        return 1;
    }
}