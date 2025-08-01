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
        
        if(a==0)
            System.out.println("Zero");
        else if(a>0)
            System.out.println("Positive");
        else
            System.out.println("Negative");
        
    }
}
