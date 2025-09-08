import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine().toLowerCase();

        boolean[] seen = new boolean[26];
        boolean isIsogram = true;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c >= 'a' && c <= 'z') { // check only letters
                int index = c - 'a';
                if (seen[index]) {
                    isIsogram = false;
                    break;
                }
                seen[index] = true;
            }
        }

        if (isIsogram) {
            System.out.println("ISOGRAM");
        } else {
            System.out.println("NOT ISOGRAM");
        }
    }
}
