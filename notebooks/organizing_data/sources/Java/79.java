import java.util.*;
import java.lang.*;

class Solution {
    
    public String decimalToBinary(int decimal) {
        return "db" + Integer.toBinaryString(decimal) + "db";
    }
}