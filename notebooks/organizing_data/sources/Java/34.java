import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> unique(List<Integer> l) {
        List<Integer> result = new ArrayList<>(new HashSet<>(l));
        Collections.sort(result);
        return result;
    }
}