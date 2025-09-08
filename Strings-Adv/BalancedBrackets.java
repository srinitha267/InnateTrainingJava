import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();

        if (isBalanced(expression)) {
            System.out.println("Balanced");
        } else {
            System.out.println("Unbalanced");
        }
    }

    public static boolean isBalanced(String expression) {
        int count = 0;

        for (char ch : expression.toCharArray()) {
            if (ch == '(') {
                count++;
            } else if (ch == ')') {
                count--;
                if (count < 0) {
                    return false; 
                }
            }
        }

        return count == 0; 
    }
}
