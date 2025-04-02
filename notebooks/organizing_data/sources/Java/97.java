import java.util.*;
import java.lang.*;

class Solution {
    
    public int multiply(int a, int b) {
        return Math.abs(a % 10) * Math.abs(b % 10);
    }
}