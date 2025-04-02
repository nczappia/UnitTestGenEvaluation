import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> byLength(List<Integer> arr) {
        List<Integer> sorted_arr = new ArrayList<>(arr);
        sorted_arr.sort(Collections.reverseOrder());
        List<String> new_arr = new ArrayList<>();
        for (int var : sorted_arr) {
            if (var >= 1 && var <= 9) {
                switch (var) {
                    case 1 -> new_arr.add("One");
                    case 2 -> new_arr.add("Two");
                    case 3 -> new_arr.add("Three");
                    case 4 -> new_arr.add("Four");
                    case 5 -> new_arr.add("Five");
                    case 6 -> new_arr.add("Six");
                    case 7 -> new_arr.add("Seven");
                    case 8 -> new_arr.add("Eight");
                    case 9 -> new_arr.add("Nine");
                }
            }
        }
        return new_arr;
    }
}