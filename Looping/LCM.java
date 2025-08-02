import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int a,b,i=2;
        a = sc.nextInt();
        b = sc.nextInt();

        while(true)
        {
            if(i%a==0 && i%b==0)
            {
                break;
            }
            i++;
        }
        System.out.println(i);
    }
}
