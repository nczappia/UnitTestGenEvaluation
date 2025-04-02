import java.util.*;
import java.lang.*;

class Solution {
    
    public int greatestCommonDivisor(int a, int b) {
        if (a == 0 || b == 0) {
            return a + b;
        }
        if (a == b) {
            return a;
        }
        if (a > b) {
            return greatestCommonDivisor(a % b, b);
        } else {
            return greatestCommonDivisor(a, b % a);
        }
    }
}