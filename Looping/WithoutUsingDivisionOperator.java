import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a,b,count=0;
        a = sc.nextInt();
        b = sc.nextInt();
        
        while(a>=b)
        {
            a = a - b;
            count++;
        }
        System.out.println(count);
        
        
    }
}
