import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> eat(int number, int need, int remaining) {
        if (need <= remaining) {
            return Arrays.asList(number + need, remaining - need);
        } else {
            return Arrays.asList(number + remaining, 0);
        }
    }
}