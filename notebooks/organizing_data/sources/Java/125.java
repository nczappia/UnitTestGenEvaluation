import java.util.*;
import java.lang.*;

class Solution {
    
    public Object splitWords(String txt) {
        if (txt.contains(" " )) {
            return Arrays.asList(txt.split(" " ));
        } else if (txt.contains("," )) {
            return Arrays.asList(txt.split("[,\s]" ));
        } else {
            int count = 0;
            for (char c : txt.toCharArray()) {
                if (Character.isLowerCase(c) && (c - 'a') % 2 == 1) {
                    count += 1;
                }
            }
            return count;
        }
    }
}