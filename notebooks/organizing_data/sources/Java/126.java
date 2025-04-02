import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean isSorted(List<Integer> lst) {
        List<Integer> sorted_lst = new ArrayList<>(lst);
        Collections.sort(sorted_lst);
        if (!lst.equals(sorted_lst)) {
            return false;
        }
        for (int i = 0; i < lst.size() - 2; i++) {
            if (lst.get(i) == lst.get(i + 1) && lst.get(i) == lst.get(i + 2)) {
                return false;
            }
        }
        return true;
    }
}