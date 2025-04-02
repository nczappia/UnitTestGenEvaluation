import java.util.*;
import java.lang.*;

class Solution {
    
    public Object roundedAvg(int n, int m) {
        if (n > m) {
            return -1;
        }
        return Integer.toBinaryString((int) Math.round((double) (m + n) / 2));
    }
}