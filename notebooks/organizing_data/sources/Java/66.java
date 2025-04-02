import java.util.*;
import java.lang.*;

class Solution {
    
    public int digitSum(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                sum += c;
            }
        }
        return sum;
    }
}