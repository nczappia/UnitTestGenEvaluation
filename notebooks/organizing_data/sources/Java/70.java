import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> strangeSortList(List<Integer> lst) {
        List<Integer> res = new ArrayList<>();
        boolean _switch = true;
        List<Integer> l = new ArrayList<>(lst);
        while (l.size() != 0) {
            if (_switch) {
                res.add(Collections.min(l));
            } else {
                res.add(Collections.max(l));
            }
            l.remove(res.get(res.size() - 1));
            _switch = !_switch;
        }
        return res;
    }
}