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
        int row,space,star;
        
        for(row=1;row<=n;row++){
            for(star=1;star<=n-row+1;star++)
                System.out.print("*");
            for(space=1;space<=2*(row-1);space++)
                System.out.print(" ");
            for(star=1;star<=n-row+1;star++)
                System.out.print("*");
            System.out.println();
        }
        
        for(row=n;row>=1;row--){
            for(star=1;star<=n-row+1;star++)
                System.out.print("*");
            for(space=1;space<=2*(row-1);space++)
                System.out.print(" ");
            for(star=1;star<=n-row+1;star++)
                System.out.print("*");
            System.out.println();
        }
    }
}
