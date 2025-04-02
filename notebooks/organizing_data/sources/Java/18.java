import java.util.*;
import java.lang.*;

class Solution {
    
    public int howManyTimes(String string, String substring) {
        int times = 0;

        for (int i = 0; i < string.length() - substring.length() + 1; i++) {
            if (string.substring(i, i + substring.length()).equals(substring)) {
                times += 1;
            }
        }

        return times;
    }
}