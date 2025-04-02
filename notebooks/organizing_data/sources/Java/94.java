import java.util.*;
import java.lang.*;

class Solution {
    
    public int skjkasdkd(List<Integer> lst) {
        int maxx = 0;
        for (int i : lst) {
            if (i > maxx) {
                boolean isPrime = i != 1;
                for (int j = 2; j < Math.sqrt(i) + 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    maxx = i;
                }
            }
        }
        int sum = 0;
        for (char c : String.valueOf(maxx).toCharArray()) {
            sum += (c - '0');
        }
        return sum;
    }
}