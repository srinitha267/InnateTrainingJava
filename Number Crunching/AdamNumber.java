import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        int sq =n*n;
        int ld,ld1,rev=0,rev1=0;
        
        while(n>0){
            ld=n%10;
            n=n/10;
            rev=rev*10+ld;
        }

        int sqrev=rev*rev;
        while(sq>0){
            ld1=sq%10;
            sq=sq/10;
            rev1=rev1*10+ld1;
        }
        if(rev1==sqrev)
            System.out.print("Adam Number");
        else
            System.out.print("Not a adam number");
    }
}
