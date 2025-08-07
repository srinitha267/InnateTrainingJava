import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (float)a/b;
        int d = a%b;
        
        System.out.printf("%d / %d = %.6f\n", a, b, c);
        System.out.print(a+" % "+b+" = "+d);
    }
}
