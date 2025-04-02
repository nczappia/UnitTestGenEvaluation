import java.util.*;
import java.lang.*;

class Solution {
    
    public List<Integer> evenOddPalindrome(int n) {
        int even_palindrome_count = 0, odd_palindrome_count = 0;

        for (int i = 1; i <= n; i++) {
            if (String.valueOf(i).equals(new StringBuilder(String.valueOf(i)).reverse().toString())) {
                if (i % 2 == 1) {
                    odd_palindrome_count += 1;
                } else {
                    even_palindrome_count += 1;
                }
            }
        }
        return Arrays.asList(even_palindrome_count, odd_palindrome_count);
    }
}