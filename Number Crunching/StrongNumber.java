import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n,sum=0,fact=1,ld;
        n=sc.nextInt();
        int copy = n;
        
        while(n>0){
            ld=n%10;
            n=n/10;
            fact=1;
            for(int i=1;i<=ld;i++){
                fact=fact*i;
            }
            sum=sum+fact;
        }
        if(sum==copy)
            System.out.print("Strong Number");
        else
            System.out.print("Not a strong number");
    }
}
