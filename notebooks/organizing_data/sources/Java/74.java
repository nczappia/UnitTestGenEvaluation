import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> totalMatch(List<String> lst1, List<String> lst2) {
        int l1 = 0;
        for (String st : lst1) {
            l1 += st.length();
        }

        int l2 = 0;
        for (String st : lst2) {
            l2 += st.length();
        }

        if (l1 <= l2) {
            return lst1;
        } else {
            return lst2;
        }
    }
}