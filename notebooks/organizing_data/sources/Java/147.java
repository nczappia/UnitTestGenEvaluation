import java.util.*;
import java.lang.*;

class Solution {
    
    public int getMaxTriples(int n) {
        List<Integer> A = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            A.add(i * i - i + 1);
        }
        int count = 0;
        for (int i = 0; i < A.size(); i++) {
            for (int j = i + 1; j < A.size(); j++) {
                for (int k = j + 1; k < A.size(); k++) {
                    if ((A.get(i) + A.get(j) + A.get(k)) % 3 == 0) {
                        count += 1;
                    }
                }
            }
        }
        return count;
    }
}