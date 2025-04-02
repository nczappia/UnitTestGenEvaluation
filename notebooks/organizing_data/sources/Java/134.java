import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean checkIfLastCharIsALetter(String txt) {
        String[] words = txt.split(" ", -1);
        String check = words[words.length - 1];
        return check.length() == 1 && Character.isLetter(check.charAt(0));
    }
}