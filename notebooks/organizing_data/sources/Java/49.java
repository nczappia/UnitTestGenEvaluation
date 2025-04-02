import java.util.*;
import java.lang.*;

class Solution {
    
    public int modp(int n, int p) {
        int ret = 1;
        for (int i = 0; i < n; i++) {
            ret = (ret * 2) % p;
        }
        return ret;
    }
}