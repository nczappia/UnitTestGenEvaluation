import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean sameChars(String s0, String s1) {
        Set<Character> set0 = new HashSet<>();
        for (char c : s0.toCharArray()) {
            set0.add(c);
        }
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        return set0.equals(set1);
    }
}