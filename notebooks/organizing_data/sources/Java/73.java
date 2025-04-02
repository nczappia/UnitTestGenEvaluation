import java.util.*;
import java.lang.*;

class Solution {
    
    public int smallestChange(List<Integer> arr) {
        int ans = 0;
        for (int i = 0; i < arr.size() / 2; i++) {
            if (!Objects.equals(arr.get(i), arr.get(arr.size() - i - 1))) {
                ans += 1;
            }
        }
        return ans;
    }
}