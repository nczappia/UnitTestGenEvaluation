import java.util.*;
import java.lang.*;

class Solution {
    
    public String StrongestExtension(String class_name, List<String> extensions) {
        String strong = extensions.get(0);
        int my_val = (int) (strong.chars().filter(Character::isUpperCase).count() - strong.chars().filter(Character::isLowerCase).count());
        for (String s : extensions) {
            int val = (int) (s.chars().filter(Character::isUpperCase).count() - s.chars().filter(Character::isLowerCase).count());
            if (val > my_val) {
                strong = s;
                my_val = val;
            }
        }
        return class_name + "." + strong;
    }
}