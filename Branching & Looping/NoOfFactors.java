import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n,i,count = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        
        for(i = 1;i<=n;i++){
            if(n%i==0)
                count++;
        }
        System.out.print(count);
    }
}
