import java.util.*;
import java.lang.*;

class Solution {
    
    public String changeBase(int x, int base) {
        StringBuilder ret = new StringBuilder();
        while (x > 0) {
            ret.append(String.valueOf(x % base));
            x /= base;
        }
        return ret.reverse().toString();
    }
}