import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean cycpatternCheck(String a, String b) {
        int l = b.length();
        String pat = b + b;
        for (int i = 0; i <= a.length() - l; i++) {
            for (int j = 0; j <= l; j++) {
                if (a.substring(i, i + l).equals(pat.substring(j, j + l))) {
                    return true;
                }
            }
        }
        return false;
    }
}