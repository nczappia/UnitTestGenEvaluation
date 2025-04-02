import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> selectWords(String s, int n) {
        List<String> result = new ArrayList<>();
        for (String word : s.split(" ")) {
            int n_consonants = 0;
            for (char c : word.toCharArray()) {
                c = Character.toLowerCase(c);
                if ("aeiou".indexOf(c) == -1) {
                    n_consonants += 1;
                }
            }
            if (n_consonants == n) {
                result.add(word);
            }
        }
        return result;
    }
}