import java.util.*;
import java.lang.*;

class Solution {
    
    public List<List<Integer>> getRow(List<List<Integer>> lst, int x) {
        List<List<Integer>> coords = new ArrayList<>();
        for (int i = 0; i < lst.size(); i++) {
            List<List<Integer>> row = new ArrayList<>();
            for (int j = lst.get(i).size() - 1; j >= 0; j--) {
                if (lst.get(i).get(j) == x) {
                    row.add(Arrays.asList(i, j));
                }
            }
            coords.addAll(row);
        }
        return coords;
    }
}