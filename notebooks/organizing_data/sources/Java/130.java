import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> tri(int n) {
        if (n == 0) {
            return List.of(1);
        }
        List<Integer> my_tri = new ArrayList<>(Arrays.asList(1, 3));
        for (int i = 2; i <= n; i++) {
            if (i % 2 == 0) {
                my_tri.add(i / 2 + 1);
            } else {
                my_tri.add(my_tri.get(my_tri.size() - 1) + my_tri.get(my_tri.size() - 2) + (i + 3) / 2);
            }
        }
        return my_tri;
    }
}