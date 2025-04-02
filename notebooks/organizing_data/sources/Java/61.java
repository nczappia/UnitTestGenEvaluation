import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean correctBracketing(String brackets) {
        int depth = 0;
        for (char b : brackets.toCharArray()) {
            if (b == '(') {
                depth += 1;
            } else {
                depth -= 1;
            }
            if (depth < 0) {
                return false;
            }
        }
        return depth == 0;
    }
}