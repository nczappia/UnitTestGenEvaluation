import java.util.*;
import java.lang.*;

class Solution {
    
    public String removeVowels(String text) {
        StringBuilder sb = new StringBuilder();
        for (char ch : text.toCharArray()) {
            if ("aeiou".indexOf(Character.toLowerCase(ch)) == -1) {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}