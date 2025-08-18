import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int size=sc.nextInt();
        int a[]=new int[size];
        
        for(int i=0;i<size;i++){
            a[i]=sc.nextInt();
        }
        int largest=a[0];
        
        for(int i=1;i<size;i++){
            if(a[i]>largest)
                largest=a[i];
        }
        System.out.print(largest);
    }
}
