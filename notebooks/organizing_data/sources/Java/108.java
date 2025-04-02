import java.util.*;
import java.lang.*;

class Solution {
    
    public int countNums(List<Integer> arr) {
        int count = 0;
        for (int n: arr) {
            int neg = 1;
            if (n < 0) {
                n = -n;
                neg = -1;
            }
            List<Integer> digits = new ArrayList<>();
            for (char digit : String.valueOf(n).toCharArray()) {
                digits.add(digit - '0');
            }
            digits.set(0, digits.get(0) * neg);
            if (digits.stream().reduce(0, Integer::sum) > 0) {
                count += 1;
            }
        }
        return count;
    }
}