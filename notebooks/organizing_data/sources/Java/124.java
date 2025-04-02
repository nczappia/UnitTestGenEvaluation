import java.util.*;
import java.lang.*;

class Solution {
    
    public boolean validDate(String date) {
        try {
            date = date.strip();
            String[] dates = date.split("-" );
            String m = dates[0];
            while (!m.isEmpty() && m.charAt(0) == '0') {
                m = m.substring(1);
            }
            String d = dates[1];
            while (!d.isEmpty() && d.charAt(0) == '0') {
                d = d.substring(1);
            }
            String y = dates[2];
            while (!y.isEmpty() && y.charAt(0) == '0') {
                y = y.substring(1);
            }
            int month = Integer.parseInt(m), day = Integer.parseInt(d), year = Integer.parseInt(y);
            if (month < 1 || month > 12) {
                return false;
            }
            if (Arrays.asList(1, 3, 5, 7, 8, 10, 12).contains(month) && (day < 1 || day > 31)) {
                return false;
            }
            if (Arrays.asList(4, 6, 9, 11).contains(month) && (day < 1 || day > 30)) {
                return false;
            }
            if (month == 2 && (day < 1 || day > 29)) {
                return false;
            }
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}