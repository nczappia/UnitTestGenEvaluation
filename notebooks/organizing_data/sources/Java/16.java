import java.util.*;
import java.lang.*;

class Solution {
    
    public int countDistinctCharacters(String string) {
        Set<Character> set = new HashSet<>();
        for (char c : string.toLowerCase().toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}