import java.util.*;
import java.lang.*;

class Solution {
    
    public List<String> numericalLetterGrade(List<Double> grades) {
        List<String> letter_grade = new ArrayList<>();
        for (double gpa : grades) {
            if (gpa == 4.0) {
                letter_grade.add("A+");
            } else if (gpa > 3.7) {
                letter_grade.add("A");
            } else if (gpa > 3.3) {
                letter_grade.add("A-");
            } else if (gpa > 3.0) {
                letter_grade.add("B+");
            } else if (gpa > 2.7) {
                letter_grade.add("B");
            } else if (gpa > 2.3) {
                letter_grade.add("B-");
            } else if (gpa > 2.0) {
                letter_grade.add("C+");
            } else if (gpa > 1.7) {
                letter_grade.add("C");
            } else if (gpa > 1.3) {
                letter_grade.add("C-");
            } else if (gpa > 1.0) {
                letter_grade.add("D+");
            } else if (gpa > 0.7) {
                letter_grade.add("D");
            } else if (gpa > 0.0) {
                letter_grade.add("D-");
            } else {
                letter_grade.add("E");
            }
        }
        return letter_grade;
    }
}