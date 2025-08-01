import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        
        if(ch>=65 && ch<=90)
            System.out.println("UPPERCASE");
        else
            System.out.println("LOWERCASE");
    }
}
