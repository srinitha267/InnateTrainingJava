import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a,b,i;
        a = sc.nextInt();
        b = sc.nextInt();
        
        for(i=1;i<=a;i++)
        {
            System.out.println(i+" * "+b+" = "+i*b);
        }
    }
}
