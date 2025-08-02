import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,p=1,flag=0;
        n = sc.nextInt();
        
        while(p<=n)
        {
         if(p==n){
             flag=1;
         }
            p = p*2;
            
        }
        if(flag==1)
            System.out.println("YES");
        else 
            System.out.println("NO");
        
        
    }
}
