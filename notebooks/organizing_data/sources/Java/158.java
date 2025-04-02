import java.util.*;
import java.lang.*;

class Solution {
    
    public String findMax(List<String> words) {
        List<String> words_sort = new ArrayList<>(words);
        words_sort.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                Set<Character> s1 = new HashSet<>();
                for (char ch : o1.toCharArray()) {
                    s1.add(ch);
                }
                Set<Character> s2 = new HashSet<>();
                for (char ch : o2.toCharArray()) {
                    s2.add(ch);
                }
                if (s1.size() > s2.size()) {
                    return 1;
                } else if (s1.size() < s2.size()) {
                    return -1;
                } else {
                    return -o1.compareTo(o2);
                }
            }
        });
        return words_sort.get(words_sort.size() - 1);
    }
}