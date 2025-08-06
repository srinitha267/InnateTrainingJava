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
        int row,col,midStart,midEnd;
        
        if(n%2==0){
            midStart=n/2;
            midEnd=midStart+1;
        }
        else{
            midStart=midEnd=(n/2)+1;
        }
        for(row=1;row<=n;row++){
            for(col=1;col<=n;col++){
                if(row>=midStart && row<=midEnd && col>=midStart && col<=midEnd)
                    System.out.print("0");
                else
                    System.out.print("1");
            }
            System.out.println();
        }
    }
}
