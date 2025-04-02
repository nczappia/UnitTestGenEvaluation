import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> allPrefixes(String string) {
        List<String> result = new ArrayList<>();

        for (int i = 1; i <= string.length(); i++) {
            result.add(string.substring(0, i));
        }
        return result;
    }
}