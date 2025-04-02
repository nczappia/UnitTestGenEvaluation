import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> evenOddCount(int num) {
        int even_count = 0, odd_count = 0;
        for (char i : String.valueOf(Math.abs(num)).toCharArray()) {
            if ((i - '0') % 2 == 0) {
                even_count += 1;
            } else {
                odd_count += 1;
            }
        }
        return Arrays.asList(even_count, odd_count);
    }
}