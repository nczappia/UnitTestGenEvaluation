import java.util.*;
import java.lang.*;

class Solution {
    
    public String solve(int N) {
        int sum = 0;
        for (char c : String.valueOf(N).toCharArray()) {
            sum += (c - '0');
        }
        return Integer.toBinaryString(sum);
    }
}