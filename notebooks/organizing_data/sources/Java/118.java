import java.util.*;
import java.lang.*;

class Solution {
    
    public String getClosestVowel(String word) {
        if (word.length() < 3) {
            return "";
        }

        String vowels = "aeiouAEIOU";
        for (int i = word.length() - 2; i > 0; i--) {
            if (vowels.indexOf(word.charAt(i)) != -1 && vowels.indexOf(word.charAt(i + 1)) == -1 && vowels.indexOf(word.charAt(i - 1)) == -1) {
                return String.valueOf(word.charAt(i));
            }
        }
        return "";
    }
}