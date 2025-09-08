import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().toLowerCase();
        boolean[] letters = new boolean[26];
        int count = 0;
        
        for (char c : str.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                int index = c - 'a';
                if (!letters[index]) {   //default - false (!(false)) - true ; (!(true)) - false skips
                    letters[index] = true;
                    count++;
                    if (count == 26) break;
                }
            }
        }
        
        System.out.println(count == 26 ? "Pangrams" : "Not Pangrams");
    }
}
