import java.util.*;
import java.lang.*;

class Solution {
    
    public int countUpper(String value) {
        if (value.contains(".")) {
            while (value.charAt(value.length() - 1) == '0') {
                value = value.substring(0, value.length() - 1);
            }
        }
        double num = Double.parseDouble(value);
        int res = 0;
        if (value.substring(Math.max(value.length() - 2, 0)).equals(".5")) {
            if (num > 0) {
                res = (int) Math.ceil(num);
            } else {
                res = (int) Math.floor(num);
            }
        } else if(value.length() > 0) {
            res = (int) Math.round(num);
        }
        return res;
    }
}