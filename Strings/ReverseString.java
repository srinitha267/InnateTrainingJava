import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();  

        char[] c = a.toCharArray();
        String reversed = "";

        for (int i = c.length - 1; i >= 0; i--) {
            reversed += c[i];
        }

        System.out.println(reversed);
    }
}
