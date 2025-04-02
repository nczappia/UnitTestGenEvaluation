import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean checkDictCase(Map<Object, Object> dict) {
        if (dict.isEmpty()) {
            return false;
        }
        String state = "start";
        for (Map.Entry entry : dict.entrySet()) {
            if (!(entry.getKey() instanceof String key)) {
                state = "mixed";
                break;
            }
            boolean is_upper = true, is_lower = true;
            for (char c : key.toCharArray()) {
                if (Character.isLowerCase(c)) {
                    is_upper = false;
                } else if (Character.isUpperCase(c)) {
                    is_lower = false;
                } else {
                    is_upper = false;
                    is_lower = false;
                }
            }
            if (state.equals("start")) {
                if (is_upper) {
                    state = "upper";
                } else if (is_lower) {
                    state = "lower";
                } else {
                    break;
                }
            } else if ((state.equals("upper") && !is_upper) || (state.equals("lower") && !is_lower)) {
                state = "mixed";
                break;
            }
        }
        return state.equals("upper") || state.equals("lower");
    }
}