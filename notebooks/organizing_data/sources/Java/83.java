import java.util.*;
import java.lang.*;

class Solution {
    
    public int startsOneEnds(int n) {
        if (n == 1) {
            return 1;
        }
        return 18 * (int) Math.pow(10, n - 2);
    }
}