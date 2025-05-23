import java.util.*;
import java.lang.*;
import java.util.stream.Collectors;

class Solution {
    
    public List<String> filterByPrefix(List<String> strings, String prefix) {
        return strings.stream().filter(p -> p.startsWith(prefix)).collect(Collectors.toList());
    }
}