import java.util.*;
import java.lang.*;

class Solution {
    
    public String encode(String message) {
        String vowels = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();
        for (char c : message.toCharArray()) {
            char ch = c;
            if (Character.isUpperCase(ch)) {
                ch = Character.toLowerCase(ch);
                if (vowels.indexOf(ch) != -1) {
                    ch = (char) ('a' + ((ch - 'a' + 28) % 26));
                }
            } else if (Character.isLowerCase(ch)) {
                ch = Character.toUpperCase(ch);
                if (vowels.indexOf(ch) != -1) {
                    ch = (char) ('A' + ((ch - 'A' + 28) % 26));
                }
            }
            sb.append(ch);
        }
        return sb.toString();
    }
}