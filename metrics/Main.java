//Source method
import java.util.*;
import java.lang.*;

class Solution {
    public List<Integer> generateIntegers(int a, int b) {
        int lower = Math.max(2, Math.min(a, b));
        int upper = Math.min(8, Math.max(a, b));

        List<Integer> result = new ArrayList<>();
        for (int i = lower; i <= upper; i += 2) {
            result.add(i);
        }
        return result;
    }
}

//Unit Test Cases
public class Main {
        public static void main(String[] args) {
            Solution sol = new Solution();
            List<Integer> result = sol.generateIntegers(2, 8);
            System.out.println(result);
        }
}