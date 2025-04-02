import java.util.*;
import java.lang.*;

class Solution {
    
    public int sumToN(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }
}