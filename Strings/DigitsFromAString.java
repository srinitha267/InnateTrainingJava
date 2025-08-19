import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();

        StringBuilder digits = new StringBuilder();

        for (int i = 0; i <= a.length()-1; i++) {
            char c = a.charAt(i);
            if (Character.isDigit(c)) {
                digits.append(c);
            }
        }

        if (digits.length() == 0) {
            System.out.println(0);
        } else {
            System.out.println(digits.toString());
        }
    }
}
