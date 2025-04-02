import java.util.*;
import java.lang.*;

class Solution {
    
    public int doAlgebra(List<String> operator, List<Integer> operand) {
        List<String> ops = new ArrayList<>(operator);
        List<Integer> nums = new ArrayList<>(operand);
        for (int i = ops.size() - 1; i >= 0; i--) {
            if (ops.get(i).equals("**")) {
                nums.set(i, (int) Math.round(Math.pow(nums.get(i), nums.get(i + 1))));
                nums.remove(i + 1);
                ops.remove(i);
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("*")) {
                nums.set(i, nums.get(i) * nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            } else if (ops.get(i).equals("/")) {
                nums.set(i, nums.get(i) / nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        for (int i = 0; i < ops.size(); i++) {
            if (ops.get(i).equals("+")) {
                nums.set(i, nums.get(i) + nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            } else if (ops.get(i).equals("-")) {
                nums.set(i, nums.get(i) - nums.get(i + 1));
                nums.remove(i + 1);
                ops.remove(i);
                i--;
            }
        }
        return nums.get(0);
    }
}