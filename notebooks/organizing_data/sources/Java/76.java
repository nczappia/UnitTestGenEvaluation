import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean isSimplePower(int x, int n) {
        if (n == 1) {
            return x == 1;
        }
        int power = 1;
        while (power < x) {
            power = power * n;
        }
        return power == x;
    }
}