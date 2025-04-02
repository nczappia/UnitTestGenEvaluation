import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> sortArray(List<Integer> arr) {
                List < Integer > sorted_arr = new ArrayList<>(arr);
        sorted_arr.sort(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int cnt1 = (int) Integer.toBinaryString(Math.abs(o1)).chars().filter(ch -> ch == '1').count();
                int cnt2 = (int) Integer.toBinaryString(Math.abs(o2)).chars().filter(ch -> ch == '1').count();
                if (cnt1 > cnt2) {
                    return 1;
                } else if (cnt1 < cnt2) {
                    return -1;
                } else {
                    return o1.compareTo(o2);
                }
            }
        });
        return sorted_arr;
    }
}