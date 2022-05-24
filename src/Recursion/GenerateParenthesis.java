/**
 * Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
 * Input: n = 3
 * Output: ["((()))","(()())","(())()","()(())","()()()"]
 */
package Recursion; 

import java.util.ArrayList;
import java.util.List;

public class GenerateParenthesis {
    public static void main(String[] args) {
        int n = 2;
        List<String> result = new ArrayList<String>();
        generateParenthesis("(", 1, 0, result, n);
        System.out.println(result);
    }

    private static void generateParenthesis(String str, int open, int close, List<String> result, int n) {

        if (str.length() == 2 * n) {
            result.add(str);
            return;
        }
        if (open < n) generateParenthesis(str + "(", open + 1, close, result, n);
        if (close < open) generateParenthesis(str + ")", open, close + 1, result, n);
    }
}
